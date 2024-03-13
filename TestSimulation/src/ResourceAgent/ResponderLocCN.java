/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResourceAgent;

import jade.core.Agent;
import jade.domain.FIPAAgentManagement.FailureException;
import jade.domain.FIPAAgentManagement.NotUnderstoodException;
import jade.domain.FIPAAgentManagement.RefuseException;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.proto.ContractNetResponder;
import java.util.Random;

/**
 *
 * @author MDE2021
 */
public class ResponderLocCN extends ContractNetResponder {
    
    public ResponderLocCN(Agent a, MessageTemplate mt) {
        super(a, mt);
    }
    
        @Override
    protected ACLMessage handleCfp(ACLMessage cfp) throws RefuseException, FailureException, NotUnderstoodException {
            System.out.println("ResourceAgent.ResponderLocCN.handleCfp(): Proposed " + ((ResourceAgent)myAgent).getName());

        ACLMessage proposal = cfp.createReply();
        if(((ResourceAgent)myAgent).mySkills.contains(cfp.getContent())){
            proposal.setPerformative(ACLMessage.PROPOSE);
            Random rand = new Random(System.currentTimeMillis());
            proposal.setContent(rand.nextDouble()+"");
        }else{
            proposal.setPerformative(ACLMessage.REFUSE);
        }
        return proposal;
    }

    @Override
    protected ACLMessage handleAcceptProposal(ACLMessage cfp, ACLMessage propose, ACLMessage accept) throws FailureException {
        // @TODO Send inform with resource location (for transport) and set availability to false.
               ACLMessage reply = cfp.createReply();
               reply.setPerformative(ACLMessage.INFORM);
               reply.setContent(((ResourceAgent)myAgent).myLocation);
               return reply;
    }
    
}
