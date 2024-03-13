/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProductAgent;

import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import jade.proto.AchieveREInitiator;

/**
 *
 * @author MDE2021
 */
public class RequestLocation extends AchieveREInitiator {
    
    public RequestLocation(Agent a, ACLMessage msg) {
        super(a, msg);
    }
    
        @Override
    protected void handleAgree(ACLMessage agree) {
      
    }
        @Override
    protected void handleInform(ACLMessage inform) {
        System.out.println("PA: Location set: " + inform.getContent());
            ((ProductAgent)myAgent).setLocation(inform.getContent());
            
            ((ProductAgent)myAgent).sendSMS(inform.getContent(), ((ProductAgent)myAgent));
    }
    
}
