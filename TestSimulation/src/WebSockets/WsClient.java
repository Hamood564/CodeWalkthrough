/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebSockets;

import java.net.URI;
import java.net.URISyntaxException;

/**
 *
 * @author MDE2021
 */
public class WsClient {
	public static void WsClient() throws InterruptedException, URISyntaxException {
		System.out.println("Connecting to resource by websockets");

		final WsEndpoint clientEndPoint = new WsEndpoint(new URI("ws://192.168.1.10:3000/"));
		clientEndPoint.addMessageHandler(new WsEndpoint.MessageHandler() {
                    @Override
                    public void handleMessage(String responseString) {
                        System.out.println(responseString);
                        if (responseString.equals("0")){
                            clientEndPoint.closeWS();
                        }                    
                    }
                });

		clientEndPoint.sendMessage("Sk_execute");
                while (clientEndPoint.getState()) {
    
                }
                
                        //clientEndPoint.closeWS();
		//}
        }
    
}
