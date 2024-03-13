package mqtt;

import java.net.URISyntaxException;

import org.apache.commons.cli.CommandLine;
import org.eclipse.paho.mqttv5.client.MqttConnectionOptions;
import org.eclipse.paho.mqttv5.common.MqttMessage;

public class MqttV5Connection {

	private String hostURI;
	private String clientID;
	private MqttConnectionOptions conOpts = new MqttConnectionOptions();
	private boolean automaticReconnect = false;


	public MqttV5Connection(String name) {

		// Get the Host URI

			hostURI = "tcp://localhost:1883";
			conOpts.setServerURIs(new String[] { hostURI });
                        long pid = Thread.currentThread().getId();
			clientID = name + pid;
		
	}

	public String getHostURI() {
		return hostURI;
	}

	public String getClientID() {
		return clientID;
	}

	public MqttConnectionOptions getConOpts() {
		return conOpts;
	}

	public boolean isAutomaticReconnectEnabled() {
		return this.automaticReconnect;
	}

}
