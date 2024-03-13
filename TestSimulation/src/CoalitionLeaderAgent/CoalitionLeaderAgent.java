/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CoalitionLeaderAgent;

import ProductAgent.ProductAgent;
import jade.core.Agent;
import jade.domain.FIPAException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DFInteraction;

/**
 *
 * @author Andre Rocha
 */
public class CoalitionLeaderAgent extends Agent{
    
    protected String myLocation;

    @Override
    protected void setup() {
        //Argumets [0]CLA location
        Object[] args = getArguments();
        //Get my location
        myLocation = (String) args[0];
     
        //Register in DF here
        try {
            //Register in DF here
            DFInteraction.RegisterInDF(this, this.getLocalName(),"dfservice_cla");
            //Launch Behaviour to manage Product Execution here
        } catch (FIPAException ex) {
            Logger.getLogger(ProductAgent.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Launch Behaviours here
        
    }
    
    
    @Override
    protected void takeDown() {
        
    }

}
