package test_CAEX;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;

import de.dke.caex.AttributeType;
import de.dke.caex.CAEXBasicObject.*;
import de.dke.caex.CAEXFile;
import de.dke.caex.CAEXFile.InstanceHierarchy;
import de.dke.caex.CAEXFile.InterfaceClassLib;
import de.dke.caex.CAEXFile.RoleClassLib;
import de.dke.caex.CAEXFile.SystemUnitClassLib;
import de.dke.caex.InterfaceClassType;
import de.dke.caex.InterfaceFamilyType;
import de.dke.caex.InternalElementType;
import de.dke.caex.InternalElementType.RoleRequirements;
import de.dke.caex.RoleClassType;
import de.dke.caex.RoleFamilyType;
import de.dke.caex.SystemUnitClassType;
import de.dke.caex.SystemUnitClassType.InternalLink;
import de.dke.caex.SystemUnitClassType.SupportedRoleClass;
import de.dke.caex.SystemUnitFamilyType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class basicImplementation {
	
	

	

	public static void main(String[] args) throws JAXBException {
		JAXBContext context = JAXBContext.newInstance(CAEXFile.class);
		//Instantiate the XML file object
		CAEXFile fileObject = new CAEXFile();
		fileObject.setFileName("MALTCAEXFile.caex");
		fileObject.setSchemaVersion("3.0");
		
		//instantiate CAEX objects
		Version version = new Version();
		
		
		
		Description description_interfaceclass = new Description();
		Description description_intstancehierarchy = new Description();
		Description description_roleclass= new Description();
		Description description_rolefamily = new Description();
		Description description_systemunitclass = new Description();
		Description description_attribute1= new Description();
		Description description_attribute2= new Description();
		Description description_attribute3= new Description();
		Description description_attribute4= new Description();
		Description description_attribute4_sub1= new Description();
		Description description_attribute4_sub2= new Description();
		Description description_attribute5= new Description();
		Description description_attribute5_sub1= new Description();
		Description description_attribute5_sub2= new Description();
		Description description_attribute6= new Description();
		Description description_attribute7= new Description();
		Description desc_sysunit = new Description();
		Description desc_hierarchy = new Description();
		Description description_interfaceclass2 = new Description();
		
		
		//instantiate roletype objects///////////////////////////////////////////////
		RoleClassType roletype = new RoleClassType();
		
		
		//set additional information//////////////////////////////////////////////////
		List<Object> AddInfo = new LinkedList<>();
		
		fileObject.getAdditionalInformation().add(roletype);
		
		
		
		//set instance hierarchy///////////////////////////////////////////////////////
		List<InstanceHierarchy>instanceHierarchies = new LinkedList<>();
		
		InstanceHierarchy instanceHierarchy1 = new InstanceHierarchy();
		instanceHierarchy1.setName("AssetAdministrationShellInstanceHierarchy");
		version.setValue("0");
		instanceHierarchy1.setVersion(version);
		
		InternalElementType InternalElement = new InternalElementType();
		InternalElement.setName("MALTAssetAdministrationShell");
		InternalElement.setID(UUID.randomUUID().toString());
		
		AttributeType attribute_instance = new AttributeType();
		attribute_instance.setName("identification");
		AttributeType.RefSemantic attributeRef_i = new AttributeType.RefSemantic();
		attributeRef_i.setCorrespondingAttributePath("AAS:Identifiable/identification");
		attribute_instance.getRefSemantic().add(attributeRef_i);
		attribute_instance.setValue("");
		RoleRequirements role = new RoleRequirements();
		role.setRefBaseRoleClassPath("AssetAdministrationShellRoleClassLib/Asset");
		InternalElement.getRoleRequirements().add(role);
		InternalLink Internal = new InternalLink();
		Internal.setName("InternalLink");
		Internal.setRefPartnerSideA("1");
		Internal.setRefPartnerSideB("2");
		
		InternalElement.getInternalLink().add(Internal);
		InternalElement.getAttribute().add(attribute_instance) ;
		instanceHierarchy1.getInternalElement().add(InternalElement);
		instanceHierarchies.add(instanceHierarchy1);
		 
		
		
		//set interface class libraries/////////////////////////////////////////////////
		List<InterfaceClassLib>interfaceClassLibraries= new LinkedList<>();
		InterfaceClassLib interfaceClassLib1 = new InterfaceClassLib();
		interfaceClassLib1.setName("AssetAdministrationShellInterfaceClassLib");
		description_interfaceclass.setValue("Interface Class Library according to Details of the Asset Administration Shell V2.0.");
		interfaceClassLib1.setDescription(description_interfaceclass);
		version.setValue("1.0.0");
		interfaceClassLib1.setVersion(version);
		
		
		InterfaceClassType InterfaceClass = new InterfaceClassType();
		InterfaceClass.setName("FileDataReference");
		InterfaceClass.setRefBaseClassPath("AutomationMLBPRInterfaceClassLib/ExternalDataReference");
		description_interfaceclass2.setValue("A FileDataReference represents the address to a File. FileDataReference is derived from the AutomationML Interface Class ExternalDataReference that is defined in AutomationML BPR_005E_ExternalDataReference_v1.0.0_2:The interface class “ExternalDataReference” shall be used in order to reference external documents out of the scope of AutomationML.\r\n"
				+ "");
		
		
		InterfaceFamilyType InterfaceFamily = new InterfaceFamilyType();
		InterfaceFamily.setName("FileDataReference");
		InterfaceFamily.setRefBaseClassPath("AutomationMLBPRInterfaceClassLib/ExternalDataReference");
		description_interfaceclass2.setValue("A FileDataReference represents the address to a File. FileDataReference is derived from the AutomationML Interface Class ExternalDataReference that is defined in AutomationML BPR_005E_ExternalDataReference_v1.0.0_2:The interface class “ExternalDataReference” shall be used in order to reference external documents out of the scope of AutomationML.\r\n"
				+ "");
		InterfaceFamily.setDescription(description_interfaceclass2);
		
		interfaceClassLib1.getInterfaceClass().add(InterfaceFamily);
		interfaceClassLibraries.add(interfaceClassLib1);
		
		//set role class libraries////////////////////////////////////////////////////////
		List<RoleClassLib>roleClassLibraries = new LinkedList<>();
		List<RoleClassType>roleClassTypes = new LinkedList<>();
		List<RoleFamilyType>roleFamilyTypes = new LinkedList<>();
		List<AttributeType>attributeTypes = new LinkedList<>();
		List<AttributeType.RefSemantic>refSemantics = new LinkedList<>();
		RoleClassLib roleClassLib1 = new RoleClassLib();
		roleClassLib1.setName("AssetAdministrationShellRoleClassLib");
		description_roleclass.setValue("Role Class Library according to Details of the Asset Administration Shell V2.0.");
		roleClassLib1.setDescription(description_roleclass);
		version.setValue("1.0.0");
		roleClassLib1.setVersion(version);
		
		////////set attribute of role class
		AttributeType attributeType1 = new AttributeType();
		attributeType1.setAttributeDataType("xs:string");
		attributeType1.setName("idShort");
		description_attribute1.setValue("Identifying string of the element within its name space. Constraint AASd-001: In case of a referable element not being an identifiable element this id is mandatory and used for referring to the element in its name space. Constraint AASd-002: idShort shall only feature letters, digits, underscore (\"_\"); starting mandatory with a letter. Constraint AASd-003: idShort shall be matched case-insensitive. Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the “BrowserPath” in OPC UA.");
		attributeType1.setDescription(description_attribute1);
		
		AttributeType.RefSemantic attributeRef = new AttributeType.RefSemantic();
		attributeRef.setCorrespondingAttributePath("AAS:Referable/idShort");
		attributeType1.getRefSemantic().add(attributeRef);
		
		attribute_instance.getAttribute().add(attributeType1);
		
		AttributeType attributeType2 = new AttributeType();
		attributeType2.setAttributeDataType("xs:string");
		attributeType2.setName("category");
		description_attribute2.setValue("The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints.");
		
		attributeType2.setDescription(description_attribute2);
		attributeType2.setValue("");
		AttributeType.RefSemantic attributeRef2 = new AttributeType.RefSemantic();
		attributeRef2.setCorrespondingAttributePath("AAS:Referable/category");
		attributeType2.getRefSemantic().add(attributeRef2);
		
		
		AttributeType attributeType3 = new AttributeType();
		attributeType3.setAttributeDataType("xs:string");
		attributeType3.setName("description");
		description_attribute3.setValue("Description or comments on the element. The description can be provided in several languages.");
		
		attributeType3.setDescription(description_attribute3);
		attributeType3.setValue("");
		AttributeType.RefSemantic attributeRef3 = new AttributeType.RefSemantic();
		attributeRef3.setCorrespondingAttributePath("AAS:Referable/category");
		attributeType3.getRefSemantic().add(attributeRef3);
		
		
		AttributeType attributeType3_sub1 = new AttributeType();
		attributeType3_sub1.setAttributeDataType("xs:string");
		attributeType3_sub1.setName("aml-lang=EN");
		attributeType3_sub1.setValue("");
		AttributeType attributeType3_sub2 = new AttributeType();
		attributeType3_sub2.setAttributeDataType("xs:string");
		attributeType3_sub2.setName("aml-lang=DE");
		attributeType3_sub2.setValue("");
		attributeType3.getAttribute().add(attributeType3_sub1);
		attributeType3.getAttribute().add(attributeType3_sub2);
		
		
		
		AttributeType attributeType4 = new AttributeType();
//		attributeType4.setAttributeDataType("xs:string");
		attributeType4.setName("identification");
		description_attribute4.setValue("Abstract attribute class for identification. Has the subattributes id and idType");
		
		attributeType4.setDescription(description_attribute4);
//		attributeType4.setValue("");
		AttributeType.RefSemantic attributeRef4 = new AttributeType.RefSemantic();
		AttributeType.RefSemantic attributeRef4_sub1 = new AttributeType.RefSemantic();
		AttributeType.RefSemantic attributeRef4_sub2 = new AttributeType.RefSemantic();
		attributeRef4.setCorrespondingAttributePath("AAS:Identifiable/identification");
		attributeType4.getRefSemantic().add(attributeRef4);
		
		
		AttributeType attributeType4_sub1 = new AttributeType();
		attributeType4_sub1.setAttributeDataType("xs:string");
		attributeType4_sub1.setName("id");
		description_attribute4_sub1.setValue("Identifier of the element. Its type is defined in idType. Id is a subproperty of identification.");
		attributeType4_sub1.setDescription(description_attribute4_sub1);
		attributeType4_sub1.setValue("");
		attributeRef4_sub1.setCorrespondingAttributePath("AAS:Identifier/id");
		attributeType4_sub1.getRefSemantic().add(attributeRef4_sub1);
		AttributeType attributeType4_sub2 = new AttributeType();
		attributeType4_sub2.setAttributeDataType("xs:string");
		attributeType4_sub2.setName("idType");
		description_attribute4_sub2.setValue("Type of the Identifier, e.g. URI, IRDI etc. The supported Identifier types are defined in the enumeration “IdentifierType”. IdType is a subproperty of identification.");
		attributeType4_sub2.setDescription(description_attribute4_sub2);
		attributeType4_sub2.setValue("");
		attributeRef4_sub2.setCorrespondingAttributePath("AAS:Identifier/idType");
		attributeType4_sub2.getRefSemantic().add(attributeRef4_sub2);
		attributeType4.getAttribute().add(attributeType4_sub1);
		attributeType4.getAttribute().add(attributeType4_sub2);
		
		
		
		AttributeType attributeType5 = new AttributeType();
//		attributeType4.setAttributeDataType("xs:string");
		attributeType5.setName("administration");
		description_attribute5.setValue("Abstract attribute for administration. Has the subattributes revision and version.");
		
		attributeType5.setDescription(description_attribute5);
//		attributeType5.setValue("");
		AttributeType.RefSemantic attributeRef5 = new AttributeType.RefSemantic();
		AttributeType.RefSemantic attributeRef5_sub1 = new AttributeType.RefSemantic();
		AttributeType.RefSemantic attributeRef5_sub2 = new AttributeType.RefSemantic();
		attributeRef5.setCorrespondingAttributePath("AAS:Identifiable/administration");
		attributeType5.getRefSemantic().add(attributeRef5);
		
		
		AttributeType attributeType5_sub1 = new AttributeType();
		attributeType5_sub1.setAttributeDataType("xs:string");
		attributeType5_sub1.setName("revision");
		description_attribute5_sub1.setValue("Revision of the element. Constraint AASd-005: A revision requires a version. This means, if there is no version there is no revision neither. Revision is a subproperty of administration.");
		attributeType5_sub1.setDescription(description_attribute5_sub1);
		attributeType5_sub1.setValue("");
		attributeRef5_sub1.setCorrespondingAttributePath("AAS:AdministrativeInformation/revision");
		attributeType5_sub1.getRefSemantic().add(attributeRef5_sub1);
		AttributeType attributeType5_sub2 = new AttributeType();
		attributeType5_sub2.setAttributeDataType("xs:string");
		attributeType5_sub2.setName("version");
		description_attribute5_sub2.setValue("Version of the element. Version is a subproperty of administration.");
		attributeType5_sub2.setDescription(description_attribute5_sub2);
		attributeType5_sub2.setValue("");
		attributeRef5_sub2.setCorrespondingAttributePath("AAS:AdministrativeInformation/version");
		attributeType5_sub2.getRefSemantic().add(attributeRef5_sub2);
		attributeType5.getAttribute().add(attributeType5_sub1);
		attributeType5.getAttribute().add(attributeType5_sub2);
		
		
		
		AttributeType attributeType6 = new AttributeType();
		attributeType6.setAttributeDataType("xs:string");
		attributeType6.setName("dataSpecification");
		description_attribute6.setValue("Global reference to the data specification template used by the element.");
		attributeType6.setDescription(description_attribute6);
		attributeType6.setValue("");
		AttributeType.RefSemantic attributeRef6 = new AttributeType.RefSemantic();
		attributeRef6.setCorrespondingAttributePath("AAS:HasDataSpecification/dataSpecification");
		attributeType6.getRefSemantic().add(attributeRef6);
		
		
		AttributeType attributeType7 = new AttributeType();
		attributeType7.setAttributeDataType("xs:string");
		attributeType7.setName("derivedFrom");
		description_attribute7.setValue("The derivedFrom attribute is used to establish a relationship between two Asset Administration Shells that are derived from each other");
		attributeType7.setDescription(description_attribute7);
		attributeType7.setValue("");
		AttributeType.RefSemantic attributeRef7 = new AttributeType.RefSemantic();
		attributeRef7.setCorrespondingAttributePath("AAS:AssetAdministrationShell/derivedFrom");
		attributeType7.getRefSemantic().add(attributeRef7);
		
		
		
		RoleFamilyType roleFamilyType1 = new RoleFamilyType();
		roleFamilyType1.setName("AssetAdministrationShell");
		roleFamilyType1.setRefBaseClassPath("AutomationMLBaseRoleClassLib/AutomationMLBaseRole");
		description_rolefamily.setValue("An Asset Administration Shell.");
		roleFamilyType1.setDescription(description_rolefamily);
		roleFamilyType1.getAttribute().add(attributeType1);
		roleFamilyType1.getAttribute().add(attributeType2);
		roleFamilyType1.getAttribute().add(attributeType3);
		roleFamilyType1.getAttribute().add(attributeType4);
		roleFamilyType1.getAttribute().add(attributeType5);
		roleFamilyType1.getAttribute().add(attributeType6);
		roleFamilyType1.getAttribute().add(attributeType7);
		
		
		
		
		
		roleFamilyTypes.add(roleFamilyType1);

		roleClassLib1.getRoleClass().addAll(roleFamilyTypes);
		roleClassLibraries.add(roleClassLib1);
		
		
		
		
		
		//set system unit class libraries
		List<SystemUnitClassLib>systemUnitClassLibraries = new LinkedList<>();
		List<SystemUnitClassType> systemUnitClasses = new LinkedList<>();
		SystemUnitClassLib systemunitClassLib1 = new SystemUnitClassLib();
		systemunitClassLib1.setName("AssetAdministrationShellSystemUnitClasses");
		systemunitClassLib1.setVersion(version);
		
		
		SystemUnitClassLib systemunitClassLib2 = new SystemUnitClassLib();
		systemunitClassLib2.setName("AssetAdministrationShellDataSpecificationTemplates");
		systemunitClassLib2.setVersion(version);
		
		SystemUnitClassType systemUnitClass= new SystemUnitClassType();
		systemUnitClass.setName("DataSpecificationIEC61360Template");
		systemUnitClass.setID("572c0568-4019-40ec-bfc4-a3a82dc6eed4");
		
		
		SystemUnitFamilyType systemUnitFamily = new SystemUnitFamilyType();
		systemUnitFamily.setName("DataSpecificationIEC61360Template");
		systemUnitFamily.setID("572c0568-4019-40ec-bfc4-a3a82dc6eed4");
		desc_sysunit.setValue("An AAS Data Specification template for IEC61369. A template consists of the DataSpecificationContent containing the additional attributes to be added to the element instance that references the data specification template and meta information about the template itself (this is why DataSpecification inherits from Identifiable). In UML these are two separated classes.");
		systemUnitFamily.setDescription(desc_sysunit);
		
		AttributeType attributeSys_1 = new AttributeType();
		attributeSys_1.setName("idShort");
		attributeSys_1.setAttributeDataType("xs:string");
		attributeSys_1.setDescription(desc_sysunit);
		attributeSys_1.setValue("");
		AttributeType.RefSemantic attributesys_ref1 = new AttributeType.RefSemantic();
		attributesys_ref1.setCorrespondingAttributePath("AAS:Referable/idShort");
		attributeSys_1.getRefSemantic().add(attributesys_ref1);
		
		AttributeType attributeSys_2 = new AttributeType();
		attributeSys_2.setName("idShort");
		attributeSys_2.setAttributeDataType("xs:string");
		attributeSys_2.setDescription(desc_sysunit);
		attributeSys_2.setValue("");
		attributeSys_1.getAttribute().add(attributeSys_2);
		
		SupportedRoleClass supprole1= new SupportedRoleClass();
		supprole1.setRefRoleClassPath("AssetAdministrationShellRoleClassLib/DataSpecification");
		
		systemUnitFamily.getSupportedRoleClass().add(supprole1);
		systemUnitFamily.getAttribute().add(attributeSys_1);
		
		
		SystemUnitFamilyType systemUnitFamily2 = new SystemUnitFamilyType();
		systemUnitFamily2.setName("DataSpecificationIEC61360");
		systemUnitFamily.getSystemUnitClass().add(systemUnitFamily2);
		
		
		systemunitClassLib2.getSystemUnitClass().add(systemUnitFamily);
		systemUnitClassLibraries.add(systemunitClassLib1);
		systemUnitClassLibraries.add(systemunitClassLib2);
		
		
		
		
		
		
		
		
		
		
		
		// assign libraries and hierarchies to the XML file Object 
		fileObject.getInstanceHierarchy().addAll(instanceHierarchies);
		fileObject.getSystemUnitClassLib().addAll(systemUnitClassLibraries);
		fileObject.getInterfaceClassLib().addAll(interfaceClassLibraries);
		fileObject.getRoleClassLib().addAll(roleClassLibraries);
		
		
		
		
		
		
		
		
		
		
		
		
		//Final Marshal to XML file Object--Keep at last
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		marshaller.marshal(fileObject, System.out); //write to output
		
				
	}

}
