/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResourceAgent;


import ProductAgent.ProductAgent;
import WebSockets.WsClient;
import jade.core.Agent;
import jade.domain.FIPAAgentManagement.FailureException;
import jade.domain.FIPAAgentManagement.NotUnderstoodException;
import jade.domain.FIPAAgentManagement.RefuseException;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import jade.proto.AchieveREResponder;
import java.net.URISyntaxException;
import java.util.Date;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import mqtt.Mode;
import mqtt.MqttV5Executor;


/**
 *
 * @author MDE2021
 */
public class ExecuteSkill extends AchieveREResponder{
    
    public ExecuteSkill(Agent a, MessageTemplate mt) {
        super(a, mt);
    }
    
    @Override
    protected ACLMessage handleRequest(ACLMessage request) throws NotUnderstoodException, RefuseException {
        // @TODO handle the requests, e.g., if skill matches send agree, otherwise refuse
        ACLMessage reply = request.createReply();
        reply.setPerformative(ACLMessage.AGREE);
        return reply;
    }

    @Override
    protected ACLMessage prepareResultNotification(ACLMessage request, ACLMessage response) throws FailureException {
        ACLMessage reply = request.createReply();
        //if(((ResourceAgent)myAgent).myLib.executeSkill(request.getContent())){
        long start = new Date().getTime();
        double randomTime;
        Random rand = new Random(System.currentTimeMillis());
        randomTime = rand.nextDouble() * 10000;
        System.out.println("ResourceAgent.ExecuteSkill.prepareResultNotification(): " + randomTime);
        if (((ResourceAgent) myAgent).myLocation.equals("D_8")){
            try {
                WsClient.WsClient();
            } catch (InterruptedException | URISyntaxException ex) {
                Logger.getLogger(ExecuteSkill.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            if (((ResourceAgent) myAgent).myLocation.equals("D_7")){
                //Publish on topic
                MqttV5Executor v5Executor = new MqttV5Executor("PUB", ((ResourceAgent) myAgent).getName()+" " + randomTime + " PUB", 5000);
                v5Executor.execute("Sk_execute");
                //Reads from topic
                MqttV5Executor v5Executor2 = new MqttV5Executor("SUB", ((ResourceAgent) myAgent).getName()+" " + randomTime + " SUB", 5000);
                v5Executor2.execute("D_7");
            }else{
                
        while((new Date().getTime() - start < randomTime)){
                //just wait
                }
        }
        }

        reply.setPerformative(ACLMessage.INFORM);
        //    ((ResourceAgent)myAgent).availability = true;
        //}else{
        //    reply.setPerformative(ACLMessage.FAILURE);
        //}

        return reply;

    }
}
