package mqtt;

import org.apache.commons.cli.CommandLine;

public class MqttV5Subscribe {
	private String topic = "world";
	private int qos = 0;
	private boolean verbose = false;

	public MqttV5Subscribe() {
			topic = "D_7";
                        qos = 0;
                        verbose = true;
	}

	public String getTopic() {
		return topic;
	}

	public int getQos() {
		return qos;
	}

	public boolean isVerbose() {
		return verbose;
	}
	
}
