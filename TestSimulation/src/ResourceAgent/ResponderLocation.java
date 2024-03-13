/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResourceAgent;

import jade.core.Agent;
import jade.domain.FIPAAgentManagement.NotUnderstoodException;
import jade.domain.FIPAAgentManagement.RefuseException;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.proto.AchieveREResponder;

/**
 *
 * @author MDE2021
 */
public class ResponderLocation extends AchieveREResponder{
    
    public ResponderLocation(Agent a, MessageTemplate mt) {
        super(a, mt);
    }
    
        @Override
    protected ACLMessage handleRequest(ACLMessage request) throws NotUnderstoodException, RefuseException {
        System.out.println(request.getContent());
        System.out.println("RA: Location Request: " + ((ResourceAgent)myAgent).getPosition());
        
        ACLMessage informToSend = request.createReply();
        informToSend.setPerformative(ACLMessage.INFORM);
        informToSend.setContent(((ResourceAgent)myAgent).getPosition());
        return informToSend;
    }
}
