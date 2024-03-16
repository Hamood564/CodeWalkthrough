package Utilities;

import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import de.dke.caex.AttributeType;
import de.dke.caex.RoleFamilyType;
import de.dke.caex.SystemUnitFamilyType;
import de.dke.caex.CAEXBasicObject.Description;
import de.dke.caex.CAEXBasicObject.Version;
import de.dke.caex.CAEXFile.RoleClassLib;
import de.dke.caex.CAEXFile.SystemUnitClassLib;
import de.dke.caex.SystemUnitClassType.SupportedRoleClass;

public class SystemUnitClass {
	public static SystemUnitClassLib settingSystemUnitClassLib(String Name, String Value, Description description, String Version, List<SystemUnitFamilyType> SystemUnitFamily ) {
		SystemUnitClassLib systemunitClassLib = new SystemUnitClassLib();
		systemunitClassLib.setName(Name);
		if (description != null) {
			systemunitClassLib.setDescription(description);
		}
		if (Version != null) {
			Version version = new Version();
			version.setValue(Version);
			systemunitClassLib.setVersion(version);
		}	
		if (SystemUnitFamily != null) {
			systemunitClassLib.getSystemUnitClass().addAll(SystemUnitFamily);
		}
		return systemunitClassLib;	
	}
	
	public static AttributeType setSystemUnitAttribute (String Name, String DataType, String Value, Description description, String AttributePath) {
		AttributeType attributeType = new AttributeType();
		attributeType.setName(Name);
		if (DataType != null) {
			attributeType.setAttributeDataType(DataType);
		}
		if (Value != null) {
			attributeType.setValue(Value);
		}
		if(description != null) {
			attributeType.setDescription(description);
		}
		
		if(AttributePath != null) {
			AttributeType.RefSemantic attributeRef = new AttributeType.RefSemantic();
			attributeRef.setCorrespondingAttributePath(AttributePath);
			attributeType.getRefSemantic().add(attributeRef);			
		}		
		return attributeType;		
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
	
	public static SystemUnitFamilyType setSystemUnitFamily (String Name, String ClassPath, Description description, List<AttributeType> attributeTypes) {
		SystemUnitFamilyType systemFamily = new SystemUnitFamilyType();
		SupportedRoleClass supprole1= new SupportedRoleClass();
		systemFamily.setName(Name);
		systemFamily.setID(UUID.randomUUID().toString());
		supprole1.setRefRoleClassPath(ClassPath);
		systemFamily.getSupportedRoleClass().add(supprole1);
		systemFamily.setRefBaseClassPath(ClassPath);
		systemFamily.setDescription(description);
		if (attributeTypes != null) {
			systemFamily.getAttribute().addAll(attributeTypes);	
		}
		return systemFamily;		
	}
	
	public static List<SystemUnitFamilyType> setSystemUnitFamilyList (List<SystemUnitFamilyType> SystemUnitfamilyList, SystemUnitFamilyType SystemUnitFamily) {
		SystemUnitfamilyList.add(SystemUnitFamily);
		return SystemUnitfamilyList;
	}
	
	public static List<SystemUnitClassLib> setSystemUnitClassLibList(List<SystemUnitClassLib> systemUnitClassLibList, SystemUnitClassLib systemUnitClassLib) {
		systemUnitClassLibList.add(systemUnitClassLib);
		return systemUnitClassLibList;
	}
	
	
}
