package complex;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "ConsolidationConfigList")
@XmlAccessorType(XmlAccessType.PROPERTY)
class ConsolidatedConfigList {
	private ConsolidationConfig consolidationConfig;
	private String version;

	public ConsolidationConfig getConsolidationConfig() {
		return consolidationConfig;
	}
	
	@XmlElement(name = "ConsolidationConfig", namespace = Namespaces.CONSO)
	public void setConsolidationConfig(ConsolidationConfig consolidationConfig) {
		this.consolidationConfig = consolidationConfig;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
}
