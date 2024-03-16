package complex;

import jakarta.xml.bind.annotation.XmlElement;

final class ConsolidationConfig {
	private Config config;

	public Config getConfig() {
		return config;
	}
	
	@XmlElement(name = "config", namespace = Namespaces.CONSO)
	public void setConfig(Config config) {
		this.config = config;
	}
	

}
