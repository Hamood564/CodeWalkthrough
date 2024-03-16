package Utilities;

import java.awt.List;

import de.dke.caex.CAEXBasicObject;
import de.dke.caex.CAEXBasicObject.Description;

public class BasicObject {
	
	public  static Description setComponentDescription(String Description) {
		Description description = new Description();
		description.setValue(Description);		
		return description;
	}
	
	
	public static CAEXBasicObject setAdditionalInfo(String AddInfo) {
		CAEXBasicObject caexobject = new CAEXBasicObject();
		caexobject.getAdditionalInformation().add(AddInfo);
		return caexobject;
		
	}

}
