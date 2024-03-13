package ProductAgent;

import jade.core.AID;
import jade.core.Agent;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Constants;
import util.DFInteraction;

/**
 *
 * @author André
 */
public class ProductAgent extends Agent{
    
    protected LinkedList<String> mySkills;
    protected int productType;
    protected String source;
    protected String nextExecutor;
    protected String myLocation;
    protected DFAgentDescription transporter = null;
    protected AID executer = null;

    @Override
    protected void setup() {
        Object[] args = getArguments();
        //Get skills to execute
        mySkills = (LinkedList<String>) args[0];                               
        myLocation = "";
        try {
            //Register in DF here
            DFInteraction.RegisterInDF(this, this.getLocalName(),Constants.DFSERVICE_PRODUCT);
            //Launch Behaviour to manage Product Execution here
        } catch (FIPAException ex) {
            Logger.getLogger(ProductAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Encontra sempre o Agent de transporte
        try {
            //search DF
            DFAgentDescription[] tAgent = DFInteraction.SearchInDF(Constants.DFSERVICE_TRANSPORT, this);
            this.transporter = tAgent[0];
            
        } catch (FIPAException ex) {
            Logger.getLogger(ProductAgent.class.getName()).log(Level.SEVERE, null, ex);
        }

        String sms ="";
        //If there is no skill, exit
        if (mySkills.isEmpty())
        {
            System.err.println("PA: No skills, exiting!");
            sms ="Si";
            sendSMS(sms, this);
        }else{
        //Pick the first skill    
        String skill = mySkills.removeFirst();
            try {
                //Find all resources and ask for skill
                DFAgentDescription[] allResources = DFInteraction.SearchInDF(Constants.DFSERVICE_RESOURCE, this);
                //Send an CN
                ArrayList<AID> receivers = new ArrayList<>();
                for(DFAgentDescription d : allResources){
                    receivers.add(d.getName());
                }
                ACLMessage cfp = RequestLocCN.createCFPMessage(receivers, skill);
                this.addBehaviour(new RequestLocCN(this, cfp));
                
             } catch (FIPAException ex) {
                Logger.getLogger(ProductAgent.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    @Override
    protected void takeDown() {
        
    }
    void setLocation(String loc){
        this.myLocation=loc;    
    }
    
    void sendSMS(String sms, ProductAgent aThis){
                    ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
                    msg.addReceiver(aThis.transporter.getName());
                    msg.setContent(sms);
                    msg.setOntology(Constants.ONTOLOGY_TRANSPORT);
                    aThis.addBehaviour(new RequestTransport(aThis, msg)); 
    }
    
    void askSkill(ProductAgent aThis){
            ACLMessage msglocal = new ACLMessage(ACLMessage.REQUEST);
            msglocal.addReceiver(aThis.executer);
            msglocal.setContent("Location");
            msglocal.setOntology(Constants.ONTOLOGY_LOCATION);
            aThis.addBehaviour(new RequestLocation(aThis, msglocal));
    }
    
    void execSkill(ProductAgent aThis){
            ACLMessage msg = new ACLMessage(ACLMessage.REQUEST);
            msg.addReceiver(aThis.executer);
            msg.setContent("Execute");
            msg.setOntology(util.Constants.ONTOLOGY_EXECUTION);
            aThis.addBehaviour(new RequestExecution(aThis, msg));
    }
    
}
