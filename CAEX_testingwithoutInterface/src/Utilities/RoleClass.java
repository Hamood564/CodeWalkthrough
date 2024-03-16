package Utilities;

import java.util.LinkedList;
import java.util.List;

import de.dke.caex.AttributeType;
import de.dke.caex.AttributeType.RefSemantic;
import de.dke.caex.CAEXBasicObject.*;
import de.dke.caex.CAEXFile.RoleClassLib;
import de.dke.caex.RoleFamilyType;

public class RoleClass {

	
	public static RoleClassLib settingRoleClasslib(String Name, String Value, Description description, String Version, List<RoleFamilyType> RoleFamilyList ) {
		RoleClassLib roleClassLib = new RoleClassLib();
		roleClassLib.setName(Name);
		roleClassLib.setDescription(description);
		Version version = new Version();
		version.setValue(Version);
		roleClassLib.setVersion(version);
		if (RoleFamilyList != null) {
			roleClassLib.getRoleClass().addAll(RoleFamilyList);
		}
		return roleClassLib;
		
	}
	
	public static AttributeType setRoleClassAttribute(String Name, String DataType, String Value, Description description, String AttributePath) {
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
	
	
	public static RoleFamilyType setRoleFamily(String Name, String ClassPath, Description description, List<AttributeType> attributeTypes) {
		RoleFamilyType roleFamily = new RoleFamilyType();
		roleFamily.setName(Name);
		roleFamily.setRefBaseClassPath(ClassPath);
		roleFamily.setDescription(description);
		if(attributeTypes != null) {
			roleFamily.getAttribute().addAll(attributeTypes);	
		}
		return roleFamily;
		
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
	
	
	public static List<RoleFamilyType> setRoleFamilyList (List<RoleFamilyType> RoleFamilyList, RoleFamilyType roleFamily) {
		RoleFamilyList.add(roleFamily);
		return RoleFamilyList;
		
	}
	
	public static List<RoleClassLib> setRoleClassLibList(List<RoleClassLib> roleClassLibList, RoleClassLib roleClassLib ){
		roleClassLibList.add(roleClassLib);
		return roleClassLibList;
		
	}
	
}
