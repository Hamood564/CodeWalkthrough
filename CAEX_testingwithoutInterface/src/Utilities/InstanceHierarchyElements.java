package Utilities;

import java.util.List;
import java.util.UUID;

import de.dke.caex.InternalElementType;
import de.dke.caex.InternalElementType.RoleRequirements;
import de.dke.caex.SystemUnitClassType.InternalLink;
import de.dke.caex.AttributeType;
import de.dke.caex.CAEXBasicObject.Description;
import de.dke.caex.CAEXBasicObject.Version;
import de.dke.caex.CAEXFile.*;
import de.dke.caex.InterfaceClassType;

public class InstanceHierarchyElements {
	public static String BaseInterfaceClass;
	
	public static String setBaseInterfaceClass(String baseInterfaceClass) {
		BaseInterfaceClass= baseInterfaceClass;
		return BaseInterfaceClass;
	}
	
	public static InstanceHierarchy setInstanceHierarchy(String Name, String versionValue) {
		InstanceHierarchy instanceHierarchy = new InstanceHierarchy();
		instanceHierarchy.setName(Name);
		Version version = new Version();
		version.setValue(versionValue);
		instanceHierarchy.setVersion(version);		
		return instanceHierarchy;
	}
	
	public static List<InstanceHierarchy> setInstanceHierarchyList(List<InstanceHierarchy> InstanceHierarchies, InstanceHierarchy instanceHierarchy) {
		InstanceHierarchies.add(instanceHierarchy);
		return InstanceHierarchies;
		
	}
	
	public static InternalElementType setInternalElement (String Name) {
		InternalElementType internalElement = new InternalElementType();
		internalElement.setName(Name);
		internalElement.setID(UUID.randomUUID().toString());
		return internalElement;
	}
	
	public static InternalElementType setIEattribute (InternalElementType internalElement, List<AttributeType> AttributeList) {
		internalElement.getAttribute().addAll(AttributeList);
		return internalElement;
	}
	
	public static List<AttributeType> setIEAttributeList (List<AttributeType> AttributeList, AttributeType Attribute){
		AttributeList.add(Attribute);
		return AttributeList;
	}
	
	public static AttributeType setIEAttributeBuild (String Name, String DataType, String Value, Description description, String AttributePath) {
		AttributeType attributeType = new AttributeType();
		attributeType.setName(Name);
		if(DataType != null) {
			attributeType.setAttributeDataType(DataType);
		}
		if(Value != null) {
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
	
	public static AttributeType linkAttribute(AttributeType attribute1, AttributeType attribute2) {
		attribute1.getAttribute().add(attribute2);
		return attribute1;
	}
	
	public static InternalElementType setRoleRequirements(InternalElementType internalElement,String Role) {
		RoleRequirements baseRole = new RoleRequirements();
		baseRole.setRefBaseRoleClassPath(Role);
		internalElement.getRoleRequirements().add(baseRole);
		return internalElement;
		
	}
	
	
	public static InternalLink setInternalLink(InternalElementType internalElementA, InternalElementType internalElementB) {
		InternalLink internalLink= new InternalLink();
		internalLink.setName("link_" + internalElementA.getName() + "-" +internalElementB.getName());
		
		InterfaceClassType ifInternalElementA = new InterfaceClassType();
		InterfaceClassType ifInternalElementB = new InterfaceClassType();
		
		
		ifInternalElementA.setRefBaseClassPath(BaseInterfaceClass);
		ifInternalElementB.setRefBaseClassPath(BaseInterfaceClass);
		
		ifInternalElementA.setID(UUID.randomUUID().toString());
		ifInternalElementB.setID(UUID.randomUUID().toString());
		
		internalElementA.getExternalInterface().add(ifInternalElementA);
		internalElementB.getExternalInterface().add(ifInternalElementB);
		
		internalLink.setRefPartnerSideA(ifInternalElementA.getID());
		internalLink.setRefPartnerSideB(ifInternalElementB.getID());
		
		
		return internalLink;
				
	}
	
	public static InternalLink setIEInternalLink(String Name ) {
		InternalLink Internal = new InternalLink();
		Internal.setName(Name);
		Internal.setRefPartnerSideA(UUID.randomUUID().toString());
		Internal.setRefPartnerSideB(UUID.randomUUID().toString());
		return Internal;
	}
	
	
	public static InternalElementType AssignInternalLink (InternalElementType internalElement, InternalLink internalLink) {
		internalElement.getInternalLink().add(internalLink);
		return internalElement;		
	}
	
	public static InternalElementType setIElink (InternalElementType internalElementA, InternalElementType internalElementB) {
		internalElementA.getInternalElement().add(internalElementB);
		return internalElementA;
	}
	public static InstanceHierarchy AssignInternalElements (InstanceHierarchy instanceHierarchy,InternalElementType internalElement) {
		instanceHierarchy.getInternalElement().add(internalElement);
		return instanceHierarchy;
	}
	
	
}
