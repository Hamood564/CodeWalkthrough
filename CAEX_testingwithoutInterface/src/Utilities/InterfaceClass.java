package Utilities;

import java.util.LinkedList;
import java.util.List;

import de.dke.caex.AttributeType;
import de.dke.caex.RoleFamilyType;
import de.dke.caex.SystemUnitFamilyType;
import de.dke.caex.CAEXBasicObject.Description;
import de.dke.caex.CAEXBasicObject.Version;
import de.dke.caex.CAEXFile.InterfaceClassLib;
import de.dke.caex.CAEXFile.RoleClassLib;
import de.dke.caex.CAEXFile.SystemUnitClassLib;
import de.dke.caex.InterfaceFamilyType;

public class InterfaceClass {
	

	public static InterfaceClassLib setInterfaceClassLib(String Name, String Value, Description description, String Version, List<InterfaceFamilyType> InterfaceClassFamilyList ) {
		InterfaceClassLib interfaceClassLib = new InterfaceClassLib();
		interfaceClassLib.setName(Name);
		interfaceClassLib.setDescription(description);
		Version version = new Version();
		version.setValue(Version);
		interfaceClassLib.setVersion(version);
		if (InterfaceClassFamilyList != null) {
			interfaceClassLib.getInterfaceClass().addAll(InterfaceClassFamilyList);
		}
		return interfaceClassLib;
		
	}
	
	public static AttributeType setInterfaceClassAttribute(String Name, String DataType, String Value, Description description, String AttributePath) {
		AttributeType attributeType = new AttributeType();
		attributeType.setName(Name);
		attributeType.setAttributeDataType(DataType);
		attributeType.setValue(Value);
		attributeType.setDescription(description);
		if(AttributePath != null) {
			AttributeType.RefSemantic attributeRef = new AttributeType.RefSemantic();
			attributeRef.setCorrespondingAttributePath(AttributePath);
			attributeType.getRefSemantic().add(attributeRef);			
		}		
		return attributeType;	
	}
	
	
	public static AttributeType linkAttribute(AttributeType attribute1, AttributeType attribute2) {
		attribute1.getAttribute().add(attribute2);
		return attribute1;
	}
	
	
	public static InterfaceFamilyType setInterfaceFamily (String Name, String ClassPath, Description description, List<AttributeType> attributeTypes) {
		InterfaceFamilyType interfaceFamily = new InterfaceFamilyType();
		interfaceFamily.setName(Name);
		interfaceFamily.setRefBaseClassPath(ClassPath);
		interfaceFamily.setDescription(description);
		if(attributeTypes != null) {
			interfaceFamily.getAttribute().addAll(attributeTypes);	
		}
		return interfaceFamily;
		
	}
	
	public static List<AttributeType> setAttributeList (AttributeType attribute1, AttributeType attribute2, AttributeType attribute3,
			AttributeType attribute4, AttributeType attribute5, AttributeType attribute6, AttributeType attribute7, AttributeType attribute8,
			AttributeType attribute9, AttributeType attribute10) {
		List<AttributeType> attributeTypes = new LinkedList<>();
		attributeTypes.add(attribute1);
		if (attribute2 != null) {
			attributeTypes.add(attribute2);			
		}
		if (attribute3 != null) {
			attributeTypes.add(attribute3);			
		}
		if (attribute4 != null) {
			attributeTypes.add(attribute4);			
		}
		if (attribute5 != null) {
			attributeTypes.add(attribute5);			
		}
		if (attribute6 != null) {
			attributeTypes.add(attribute6);			
		}
		if (attribute7 != null) {
			attributeTypes.add(attribute7);			
		}
		if (attribute8 != null) {
			attributeTypes.add(attribute8);			
		}
		if (attribute9 != null) {
			attributeTypes.add(attribute9);			
		}
		if (attribute10 != null) {
			attributeTypes.add(attribute10);			
		}
		return attributeTypes;
	}
	
	
	public static List<InterfaceFamilyType> setInterfaceFamilyList (List<InterfaceFamilyType> InterfaceFamilyList , InterfaceFamilyType InterfaceFamily) {
		InterfaceFamilyList.add(InterfaceFamily);
		return InterfaceFamilyList;
		
	}
	
	public static List<InterfaceClassLib> setInterfaceClassLibList (List<InterfaceClassLib> InterfaceClassLibList, InterfaceClassLib InterfaceClassLib ){
		InterfaceClassLibList.add(InterfaceClassLib);
		return InterfaceClassLibList;
		
	}
}
