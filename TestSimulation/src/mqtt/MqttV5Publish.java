package mqtt;

import org.apache.commons.cli.CommandLine;

public class MqttV5Publish {
	
	private byte[] payload = "Hello from the Java mqtt-client!".getBytes();
	private int qos = 0;
	private String topic = "world";
	private boolean retain = false;
	private boolean stdInLine = false;
	private boolean stdInWhole = false;
	String file = null;
	
	
	public MqttV5Publish () {
			payload = "Product Arrived".getBytes();
			qos = 0;
			retain = true;
			topic = "D_7";
		
	}


	public byte[] getPayload() {
		return payload;
	}


	public int getQos() {
		return qos;
	}


	public String getTopic() {
		return topic;
	}


	public boolean isRetain() {
		return retain;
	}


	public boolean isStdInLine() {
		return stdInLine;
	}


	public boolean isStdInWhole() {
		return stdInWhole;
	}
	
	public String getFile() {
		return file;
	}
	
	

}
