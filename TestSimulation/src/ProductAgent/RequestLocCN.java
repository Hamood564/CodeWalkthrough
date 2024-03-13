/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductAgent;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import jade.proto.ContractNetInitiator;
import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

/**
 *
 * @author MDE2021
 */
public class RequestLocCN extends ContractNetInitiator{
    
    ACLMessage initialCfp;
    
    public static ACLMessage createCFPMessage(List<AID> receivers, String content) {
        ACLMessage msg = new ACLMessage(ACLMessage.CFP);
        for (AID r : receivers) {
            msg.addReceiver(r);
        }
        msg.setContent(content);
        msg.setOntology(util.Constants.ONTOLOGY_NEGOTIATE_RESOURCE);
        System.out.println(msg.getContent());
        return msg;
    }

    public RequestLocCN(Agent a, ACLMessage cfp) {
        super(a, cfp);
        this.initialCfp = cfp;
    }

    @Override
    protected void handleAllResponses(Vector responses, Vector acceptances) {
        
        double bestProposal = -1;
        AID bestProposer = null;
        ACLMessage accept = null;
        
        Enumeration e =responses.elements();
        while (e.hasMoreElements()){
            ACLMessage msg = (ACLMessage) e.nextElement();
            if(msg.getPerformative() == ACLMessage.PROPOSE){
                ACLMessage reply = msg.createReply();
                reply.setPerformative(ACLMessage.REJECT_PROPOSAL);
                acceptances.addElement(reply);
                double proposal = Double.parseDouble(msg.getContent());
                        if (proposal > bestProposal){
                            bestProposal = proposal;
                            bestProposer = msg.getSender();
                            accept = reply;
                        }
            }
        }
        // Accept the proposal of the best proposer
        if (accept != null) {
            System.out.println("[" + myAgent.getLocalName() + "] " + "Accepting proposal " + bestProposal + " from responder " + bestProposer.getName());
            accept.setPerformative(ACLMessage.ACCEPT_PROPOSAL);
        
            ((ProductAgent) myAgent).executer=bestProposer;
            ((ProductAgent) myAgent).askSkill(((ProductAgent) myAgent));
            
        } else {
            System.out.println("Not found skill. Exiting");
            ((ProductAgent)myAgent).setLocation("Si");
            ((ProductAgent) myAgent).sendSMS("Si", ((ProductAgent) myAgent));
        }
        
        

    }

    @Override
    protected void handleInform(ACLMessage inform) {
    //    ((ProductAgent) myAgent).nextLoc = inform.getContent();
    //    System.out.println(ConsoleColors.BLUE + "[" + myAgent.getLocalName() + "] " + "Agent " + inform.getSender().getName() + " sent next location: " + ((ProductAgent) myAgent).nextLoc);       
    }
}
