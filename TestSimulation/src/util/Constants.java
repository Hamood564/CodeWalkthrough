/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author André Dionisio Rocha
 */
public class Constants {
    
    //DF Services
    public static final String DFSERVICE_TRANSPORT = "dfservice_transport";
    public static final String DFSERVICE_PRODUCT = "dfservice_product";
    public static final String DFSERVICE_RESOURCE="dfservice_resource";
    
    //Ontologies
    public static final String ONTOLOGY_TRANSPORT = "ont_tra_req";
    public static final String ONTOLOGY_START_SIMULATION = "ont_start_sim";
    public static final String ONTOLOGY_KILL_PRODUCT = "ont_kill_prod";
    public static final String ONTOLOGY_NEW_PRODUCT = "ont_new_prod";
    
    public static final String ONTOLOGY_LOCATION = "Location";
    public static final String ONTOLOGY_EXECUTION = "Execution";    
    
    public static final String ONTOLOGY_NEGOTIATE_RESOURCE = "ont_neg_res";
    
    //Tokens
    public static final String TOKEN = " #";
    public static final String TOKEN_PRODUCT_SKILLS = ";";
    
    //Timers
    public static final long TIMER_LAUNCH_PROD = 1000;                          //ms
    public static long TIMER_CHECK_NEW_PROD_MSG = 250;                          //ms

}
