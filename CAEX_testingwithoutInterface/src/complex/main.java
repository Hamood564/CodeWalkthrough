package complex;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import de.dke.caex.CAEXFile;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class main {
	
	public static void main(String[] args) {
		marshalling();
	}
	
	public static void unmarshalling() {
		try {
			JAXBContext context = JAXBContext.newInstance(ConsolidatedConfigList.class);
			ConsolidatedConfigList consolidateConfigList = new ConsolidatedConfigList();
			System.out.println("Version:" + consolidateConfigList.getVersion());
			ConsolidationConfig consolidatedConfig = consolidateConfigList.getConsolidationConfig();
			Config config = consolidatedConfig.getConfig();
			List<keyValue> keyValues= config.getKeyValue();
			keyValues.stream().forEach(e -> System.out.println("key:" + e.getKey() + "; Value: " +e.getValue() + "; type: " + e.getType()));
			
		} catch (JAXBException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
			System.out.println(e1.getLocalizedMessage());
		}
		
		
	}
	
	
	public static void marshalling() {
		JAXBContext context;
		try {
			context = JAXBContext.newInstance(ConsolidatedConfigList.class);
			ConsolidatedConfigList consolidatedConfigList = new ConsolidatedConfigList();
			List<keyValue>keyValues = new LinkedList<>();
			keyValue keyValue1 = new keyValue();
			keyValue1.setKey("Key1");
			keyValue1.setValue("value1");
			keyValue1.setType("String");
			keyValues.add(keyValue1);
			
			keyValue keyValue2 = new keyValue();
			keyValue2.setKey("Key2");
			keyValue2.setValue("value2");
			keyValue2.setType("String");
			keyValues.add(keyValue2);
			
			keyValue keyValue3 = new keyValue();
			keyValue3.setKey("Key3");
			keyValue3.setValue("value3");
			keyValue3.setType("Boolean");
			keyValues.add(keyValue3);
			
			
			Config config = new Config();
			config.setKeyValue(keyValues);
			
			ConsolidationConfig consolidatedConfig = new ConsolidationConfig();
			consolidatedConfig.setConfig(config);
			
			consolidatedConfigList.setConsolidationConfig(consolidatedConfig);
			consolidatedConfigList.setVersion(new Date().toString());
	 		
			
			try {
				Marshaller marshaller = context.createMarshaller();
				marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
				marshaller.marshal(consolidatedConfigList, System.out); //write to output
			} catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (JAXBException e1) {
			e1.printStackTrace();
		}
		
		
		
		
		
	}
	
}
