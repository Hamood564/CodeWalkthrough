/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductAgent;

import jade.core.AID;
import jade.core.Agent;
import jade.domain.FIPAAgentManagement.DFAgentDescription;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;
import jade.proto.AchieveREInitiator;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Constants;
import util.DFInteraction;

/**
 *
 * @author MDE2021
 */
public class RequestExecution extends AchieveREInitiator{
    
        public RequestExecution(Agent a, ACLMessage msg) {
        super(a, msg);
    }
        
            @Override
    protected void handleAgree(ACLMessage agree) {
        System.out.println("Executing");
    }

    @Override
    protected void handleRefuse(ACLMessage refuse) {
        System.out.println("Execution refused");
    }

    @Override
    protected void handleInform(ACLMessage inform) {
        System.out.println("Executed");
        
        String sms="";
        if (((ProductAgent)myAgent).mySkills.isEmpty())
        {
            System.err.println("PAE: no more skills");
            sms ="Si";
            
            ((ProductAgent)myAgent).sendSMS(sms, ((ProductAgent)myAgent));
            ((ProductAgent)myAgent).setLocation(sms);
        }else{
            String skill = ((ProductAgent)myAgent).mySkills.removeFirst();        
            try {
                //Find all resources and ask for skill
                DFAgentDescription[] allResources = DFInteraction.SearchInDF(Constants.DFSERVICE_RESOURCE, ((ProductAgent)myAgent));
                //Send an CN
                ArrayList<AID> receivers = new ArrayList<>();
                for(DFAgentDescription d : allResources){
                    receivers.add(d.getName());
                }
                ACLMessage cfp = RequestLocCN.createCFPMessage(receivers, skill);
                ((ProductAgent)myAgent).addBehaviour(new RequestLocCN(((ProductAgent)myAgent), cfp));
                
             } catch (FIPAException ex) {
                Logger.getLogger(ProductAgent.class.getName()).log(Level.SEVERE, null, ex);
            }
             
        }
    }
}
