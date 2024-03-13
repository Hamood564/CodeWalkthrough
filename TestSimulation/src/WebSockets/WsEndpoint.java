/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WebSockets;

import java.io.IOException;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;
import java.net.URI;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.websocket.ClientEndpoint;

import javax.websocket.CloseReason;
import javax.websocket.ContainerProvider;
import javax.websocket.DeploymentException;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.WebSocketContainer;


/**
 *
 * @author MDE2021
 */
@ClientEndpoint
public class WsEndpoint {
	private Session userSession = null;
	private MessageHandler messageHandler;


    WsEndpoint(URI uri) {
        System.out.println(uri);
		try {
			WebSocketContainer container = ContainerProvider.getWebSocketContainer();

			container.connectToServer(this, uri);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}    }
     
	@OnOpen
	public void onOpen(final Session userSession) {
		this.userSession = userSession;
	}
 
	@OnClose
	public void onClose(final Session userSession, final CloseReason reason) {
            System.out.println("fechou: " + reason);
		this.userSession = null;
	}
 
	@OnMessage
	public void onMessage(final String message) {
		if (messageHandler != null) {
			messageHandler.handleMessage(message);
		}
	}
 
	public void addMessageHandler(final MessageHandler msgHandler) {
		messageHandler = msgHandler;
	}
 
	public void sendMessage(final String message) {
		userSession.getAsyncRemote().sendText(message);
	}
 
	public static interface MessageHandler {
		public void handleMessage(String message);
	}
        
        public void closeWS(){
            try {
                userSession.close();
            } catch (IOException ex) {
                Logger.getLogger(WsEndpoint.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        public boolean getState(){
            if (this.userSession.isOpen()){
                return TRUE;
            }else{
                return FALSE;
            }
        }
}