package complex;

import java.util.List;

import jakarta.xml.bind.annotation.XmlElement;

public class Config {
	private List<keyValue> keyValue;

	public List<keyValue> getKeyValue() {
		return keyValue;
	}

	@XmlElement(name = "keyValue", namespace = Namespaces.BEE)
	public void setKeyValue(List<keyValue> keyValue) {
		this.keyValue = keyValue;
	}
	

}
