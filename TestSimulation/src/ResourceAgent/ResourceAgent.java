package ResourceAgent;

import ProductAgent.*;
import jade.core.Agent;
import jade.domain.FIPAException;
import jade.lang.acl.ACLMessage;
import jade.lang.acl.MessageTemplate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Constants;
import util.DFInteraction;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author André
 */
public class ResourceAgent extends Agent{
    
    protected LinkedList<String> mySkills;
    protected String myLocation;

    @Override
    protected void setup() {
        //Argumets [0]resource location [1]skills taht resource can perform
        Object[] args = getArguments();
        //Get my location
        myLocation = (String) args[0];
        //Get my skills
        mySkills = (LinkedList<String>) args[1];        
        
        System.out.println(this.getLocalName());
        
        //Register in DF here
        try {
            //Register in DF here
            DFInteraction.RegisterInDFS(this, mySkills, Constants.DFSERVICE_RESOURCE);
        } catch (FIPAException ex) {
            Logger.getLogger(ProductAgent.class.getName()).log(Level.SEVERE, null, ex);
        }

        //Launch Behaviours here
        this.addBehaviour(new ResponderLocation(this, MessageTemplate.and(
                MessageTemplate.MatchPerformative(ACLMessage.REQUEST), 
                MessageTemplate.MatchOntology(Constants.ONTOLOGY_LOCATION))));
        this.addBehaviour(new ResponderLocCN(this, MessageTemplate.and(
                MessageTemplate.MatchPerformative(ACLMessage.CFP), 
                MessageTemplate.MatchOntology(util.Constants.ONTOLOGY_NEGOTIATE_RESOURCE))));
        this.addBehaviour(new ExecuteSkill(this, MessageTemplate.and(
                MessageTemplate.MatchPerformative(ACLMessage.REQUEST),
                MessageTemplate.MatchOntology(Constants.ONTOLOGY_EXECUTION))));
    }

    @Override
    protected void takeDown() {
        
    }
    
    String getPosition() {
        return this.myLocation;
    }
}
