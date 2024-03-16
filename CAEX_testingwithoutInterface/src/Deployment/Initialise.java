package Deployment;

import java.util.LinkedList;
import java.util.List;

import Utilities.BasicObject;
import Utilities.FileObject;
import Utilities.InstanceHierarchyElements;
import Utilities.InterfaceClass;
import Utilities.RoleClass;
import Utilities.SystemUnitClass;
import de.dke.caex.AttributeType;
import de.dke.caex.CAEXBasicObject;
import de.dke.caex.CAEXBasicObject.Description;
import de.dke.caex.CAEXFile;
import de.dke.caex.InterfaceClassType;
import de.dke.caex.InterfaceFamilyType;
import de.dke.caex.CAEXFile.InstanceHierarchy;
import de.dke.caex.CAEXFile.InterfaceClassLib;
import de.dke.caex.CAEXFile.RoleClassLib;
import de.dke.caex.CAEXFile.SystemUnitClassLib;
import de.dke.caex.InternalElementType;
import de.dke.caex.RoleFamilyType;
import de.dke.caex.SystemUnitFamilyType;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;


public class Initialise {
	
	public static void main(String[] args) throws JAXBException{
		JAXBContext context = FileObject.setContext();
		CAEXFile fileObject = FileObject.setFileObject("MALTAAS", "3.0");
		
		
		
		//instance hierarchy
		
		InstanceHierarchy IH1= InstanceHierarchyElements.setInstanceHierarchy("AssetAdministrationShellInstanceHierarchy", "0");
		InternalElementType IE1 = InstanceHierarchyElements.setInternalElement("MALTAssetAdministrationShell");
		InternalElementType IE2 = InstanceHierarchyElements.setInternalElement("MALT");
		InternalElementType IE3 = InstanceHierarchyElements.setInternalElement("Skill");
		InternalElementType IE4 = InstanceHierarchyElements.setInternalElement("BasicTest");
		InternalElementType IE5 = InstanceHierarchyElements.setInternalElement("APICalls");
		InternalElementType IE6 = InstanceHierarchyElements.setInternalElement("connectMALT");
		InternalElementType IE7 = InstanceHierarchyElements.setInternalElement("retrieveSettings");
		
		
		
		
		List<AttributeType> IEAttList = new LinkedList<>();
		List<AttributeType> IEAttList2 = new LinkedList<>();
		List<AttributeType> IEAttList3 = new LinkedList<>();
		List<AttributeType> IEAttList4 = new LinkedList<>();
		List<AttributeType> IEAttList5 = new LinkedList<>();
		List<AttributeType> IEAttList6 = new LinkedList<>();
		List<AttributeType> IEAttList7 = new LinkedList<>();
		AttributeType IE1Att_1 = InstanceHierarchyElements.setIEAttributeBuild("identification", null, null, null, "AAS:Identifiable/identification");
		AttributeType IE1Att_1a = InstanceHierarchyElements.setIEAttributeBuild("idType", null, "Custom", null, "AAS:Identifier/idType");
		AttributeType IE1Att_1b = InstanceHierarchyElements.setIEAttributeBuild("id", null, "MyAssetAdministrationShell", null, "AAS:Identifier/id");
		AttributeType IE1Att_2 = InstanceHierarchyElements.setIEAttributeBuild("administration", null, null, null, "AAS:Identifiable/administration");
		AttributeType IE1Att_2a = InstanceHierarchyElements.setIEAttributeBuild("version", null, null, null, "AAS:AdministrativeInformation/version");
		AttributeType IE1Att_2b = InstanceHierarchyElements.setIEAttributeBuild("revision", null, null, null, "AAS:AdministrativeInformation/revision");
		AttributeType IE1Att_3 = InstanceHierarchyElements.setIEAttributeBuild("idShort", null, "MALTAssetAdministrationShell", null, "AAS:Referable/idShort");
		AttributeType IE1Att_4 = InstanceHierarchyElements.setIEAttributeBuild("description", null, "MALT AAS for representing MALT System", null, "AAS:Referable/description");
		AttributeType IE1Att_4a = InstanceHierarchyElements.setIEAttributeBuild("aml-lang=en", null, "MALT AAS for representing MALT System", null, null);
		
		
		AttributeType IE2Att_1 = InstanceHierarchyElements.setIEAttributeBuild("identification", null, null, null, "AAS:Identifiable/identification");
		AttributeType IE2Att_1a = InstanceHierarchyElements.setIEAttributeBuild("idType", null, "IRI", null, "AAS:Identifier/idType");
		AttributeType IE2Att_1b = InstanceHierarchyElements.setIEAttributeBuild("id", null, "https://example.com/ids/asset/0475_0121_4022_5990", null, "AAS:Identifier/id");
		AttributeType IE2Att_2 = InstanceHierarchyElements.setIEAttributeBuild("idShort", null, "MALT", null, "AAS:Referable/idShort");
		AttributeType IE2Att_3 = InstanceHierarchyElements.setIEAttributeBuild("description", null, "MALT asset for demo", null, "AAS:Referable/description");
		AttributeType IE2Att_3a = InstanceHierarchyElements.setIEAttributeBuild("aml-lang=en", null, "MALT asset for demo", null, null);
		AttributeType IE2Att_4 = InstanceHierarchyElements.setIEAttributeBuild("kind", null, "Instance", null, "AAS:Asset/kind");
		AttributeType IE2Att_5 = InstanceHierarchyElements.setIEAttributeBuild("assetIdentificationModelRef", null, null, null, "AAS:Asset/assetIdentificationModel");
		AttributeType IE2Att_6 = InstanceHierarchyElements.setIEAttributeBuild("billOfMaterialRef", null, null, null, "AAS:Asset/billOfMaterial");
		
		AttributeType IE3Att_1 = InstanceHierarchyElements.setIEAttributeBuild("identification", null, null, null, "AAS:Identifiable/identification");
		AttributeType IE3Att_1a = InstanceHierarchyElements.setIEAttributeBuild("idType", null, "IRI", null, "AAS:Identifier/idType");
		AttributeType IE3Att_1b = InstanceHierarchyElements.setIEAttributeBuild("id", null, "https://example.com/ids/sm/2132_1121_4022_2592", null, "AAS:Identifier/id");
		AttributeType IE3Att_2 = InstanceHierarchyElements.setIEAttributeBuild("idShort", null, "Skill", null, "AAS:Referable/idShort");
		AttributeType IE3Att_3 = InstanceHierarchyElements.setIEAttributeBuild("kind", null, "Instance", null, "AAS:HasKind/kind");
		
		AttributeType IE4Att_1 = InstanceHierarchyElements.setIEAttributeBuild("idShort", null, "BasicTest", null, "AAS:Referable/idShort");
		AttributeType IE4Att_2 = InstanceHierarchyElements.setIEAttributeBuild("description", null, "This is basic test event.", null, "AAS:Referable/description");
		AttributeType IE4Att_2a = InstanceHierarchyElements.setIEAttributeBuild("aml-lang=en", null, "This is basic test event.", null, null);
		AttributeType IE4Att_3 = InstanceHierarchyElements.setIEAttributeBuild("kind", null, "Instance", null, "AAS:HasKind/kind");
		
		AttributeType IE5Att_1 = InstanceHierarchyElements.setIEAttributeBuild("idShort", null, "APICalls", null, "AAS:Referable/idShort");
		AttributeType IE5Att_2 = InstanceHierarchyElements.setIEAttributeBuild("kind", null, "Instance", null, "AAS:HasKind/kind");
		AttributeType IE5Att_3 = InstanceHierarchyElements.setIEAttributeBuild("ordered", "xs:boolean", "false", null, "AAS:SubmodelElementCollection/ordered");
		AttributeType IE5Att_4 = InstanceHierarchyElements.setIEAttributeBuild("allowDuplicates", "xs:boolean", "false", null, "AAS:SubmodelElementCollection/allowDuplicates");
		
		AttributeType IE6Att_1 = InstanceHierarchyElements.setIEAttributeBuild("idShort", null, "connectMALT", null, "AAS:Referable/idShort");
		AttributeType IE6Att_2 = InstanceHierarchyElements.setIEAttributeBuild("description", null, "Connecting to MALT", null, "AAS:Referable/description");
		AttributeType IE6Att_2a = InstanceHierarchyElements.setIEAttributeBuild("aml-lang=en", null, "connectMALT", null, "AAS:Referable/idShort");
		AttributeType IE6Att_3 = InstanceHierarchyElements.setIEAttributeBuild("kind", null, "Instance", null, "AAS:HasKind/kind");
		AttributeType IE6Att_4 = InstanceHierarchyElements.setIEAttributeBuild("value", "xs:string", "192.168.115.205,5000", null, "AAS:Property/value");
		
		AttributeType IE7Att_1 = InstanceHierarchyElements.setIEAttributeBuild("idShort", null, "retrieveSettings", null, "AAS:Referable/idShort");
		AttributeType IE7Att_2 = InstanceHierarchyElements.setIEAttributeBuild("kind", null, "Instance", null, "AAS:HasKind/kind");
		AttributeType IE7Att_3 = InstanceHierarchyElements.setIEAttributeBuild("semanticId", null, "(ConceptDescription)(local)[IRI]https://example.com/ids/cd/3342_2121_4022_8290", null, "AAS:HasSemantics/semanticId");
		AttributeType IE7Att_4 = InstanceHierarchyElements.setIEAttributeBuild("value", "xs:string", null, null, "AAS:Property/value");
		
		
		
		
		IE1Att_1 = InstanceHierarchyElements.linkAttribute(IE1Att_1, IE1Att_1a);
		IE1Att_1 = InstanceHierarchyElements.linkAttribute(IE1Att_1, IE1Att_1b);
		IE1Att_2 = InstanceHierarchyElements.linkAttribute(IE1Att_2, IE1Att_2a);
		IE1Att_2 = InstanceHierarchyElements.linkAttribute(IE1Att_2, IE1Att_2b);
		IE1Att_2 = InstanceHierarchyElements.linkAttribute(IE1Att_4, IE1Att_4a);
		IE2Att_1 = InstanceHierarchyElements.linkAttribute(IE2Att_1, IE2Att_1a);
		IE2Att_1 = InstanceHierarchyElements.linkAttribute(IE2Att_1, IE2Att_1b);
		IE2Att_1 = InstanceHierarchyElements.linkAttribute(IE2Att_3, IE2Att_3a);
		IE3Att_1 = InstanceHierarchyElements.linkAttribute(IE3Att_1, IE3Att_1a);
		IE3Att_1 = InstanceHierarchyElements.linkAttribute(IE3Att_1, IE3Att_1b);
		IE4Att_2 = InstanceHierarchyElements.linkAttribute(IE4Att_2, IE4Att_2a);
		IE6Att_2 = InstanceHierarchyElements.linkAttribute(IE6Att_2, IE6Att_2a);
		IEAttList = InstanceHierarchyElements.setIEAttributeList(IEAttList, IE1Att_1);
		IEAttList = InstanceHierarchyElements.setIEAttributeList(IEAttList, IE1Att_2);
		IEAttList = InstanceHierarchyElements.setIEAttributeList(IEAttList, IE1Att_3);
		IEAttList = InstanceHierarchyElements.setIEAttributeList(IEAttList, IE1Att_4);
		IEAttList2 = InstanceHierarchyElements.setIEAttributeList(IEAttList2, IE2Att_1);
		IEAttList2 = InstanceHierarchyElements.setIEAttributeList(IEAttList2, IE2Att_2);
		IEAttList2 = InstanceHierarchyElements.setIEAttributeList(IEAttList2, IE2Att_3);
		IEAttList2 = InstanceHierarchyElements.setIEAttributeList(IEAttList2, IE2Att_4);
		IEAttList2 = InstanceHierarchyElements.setIEAttributeList(IEAttList2, IE2Att_5);
		IEAttList2 = InstanceHierarchyElements.setIEAttributeList(IEAttList2, IE2Att_6);
		IEAttList3 = InstanceHierarchyElements.setIEAttributeList(IEAttList3, IE3Att_1);
		IEAttList3 = InstanceHierarchyElements.setIEAttributeList(IEAttList3, IE3Att_2);
		IEAttList3 = InstanceHierarchyElements.setIEAttributeList(IEAttList3, IE3Att_3);
		IEAttList4 = InstanceHierarchyElements.setIEAttributeList(IEAttList4, IE4Att_1);
		IEAttList4 = InstanceHierarchyElements.setIEAttributeList(IEAttList4, IE4Att_2);
		IEAttList4 = InstanceHierarchyElements.setIEAttributeList(IEAttList4, IE4Att_3);
		IEAttList5 = InstanceHierarchyElements.setIEAttributeList(IEAttList5, IE5Att_1);
		IEAttList5 = InstanceHierarchyElements.setIEAttributeList(IEAttList5, IE5Att_2);
		IEAttList5 = InstanceHierarchyElements.setIEAttributeList(IEAttList5, IE5Att_3);
		IEAttList5 = InstanceHierarchyElements.setIEAttributeList(IEAttList5, IE5Att_4);
		IEAttList6 = InstanceHierarchyElements.setIEAttributeList(IEAttList6, IE6Att_1);
		IEAttList6 = InstanceHierarchyElements.setIEAttributeList(IEAttList6, IE6Att_2);
		IEAttList6 = InstanceHierarchyElements.setIEAttributeList(IEAttList6, IE6Att_3);
		IEAttList6 = InstanceHierarchyElements.setIEAttributeList(IEAttList6, IE6Att_4);
		IEAttList7 = InstanceHierarchyElements.setIEAttributeList(IEAttList7, IE7Att_1);
		IEAttList7 = InstanceHierarchyElements.setIEAttributeList(IEAttList7, IE7Att_2);
		IEAttList7 = InstanceHierarchyElements.setIEAttributeList(IEAttList7, IE7Att_3);
		IEAttList7 = InstanceHierarchyElements.setIEAttributeList(IEAttList7, IE7Att_4);
			
		
		IE2 = InstanceHierarchyElements.setRoleRequirements(IE2, "AssetAdministrationShellRoleClassLib/Asset");
		IE3 = InstanceHierarchyElements.setRoleRequirements(IE3, "AssetAdministrationShellRoleClassLib/Submodel");
		IE4 = InstanceHierarchyElements.setRoleRequirements(IE4, "AssetAdministrationShellRoleClassLib/BasicEvent");
		IE5 = InstanceHierarchyElements.setRoleRequirements(IE5, "AssetAdministrationShellRoleClassLib/SubmodelElementCollection");
		IE6 = InstanceHierarchyElements.setRoleRequirements(IE6, "AssetAdministrationShellRoleClassLib/Property");
		IE7 = InstanceHierarchyElements.setRoleRequirements(IE7, "AssetAdministrationShellRoleClassLib/Property");
		
		IE2 = InstanceHierarchyElements.setIEattribute(IE2, IEAttList2);
		IE3 = InstanceHierarchyElements.setIEattribute(IE3, IEAttList3);
		IE4= InstanceHierarchyElements.setIEattribute(IE4, IEAttList4);
		IE5 = InstanceHierarchyElements.setIEattribute(IE5, IEAttList5);
		IE6 = InstanceHierarchyElements.setIEattribute(IE6, IEAttList6);
		IE7 = InstanceHierarchyElements.setIEattribute(IE7, IEAttList7);
		IE5 =InstanceHierarchyElements.setIElink(IE5, IE7);
		IE5 =InstanceHierarchyElements.setIElink(IE5, IE6);
		IE3 = InstanceHierarchyElements.setIElink(IE3, IE5);
		IE3 = InstanceHierarchyElements.setIElink(IE3, IE4);
		IE1 = InstanceHierarchyElements.setIElink(IE1, IE2);
		IE1 = InstanceHierarchyElements.setIElink(IE1, IE3);
		IE1 = InstanceHierarchyElements.setIEattribute(IE1, IEAttList);
		IH1 = InstanceHierarchyElements.AssignInternalElements(IH1, IE1);
		
		
		List<InstanceHierarchy> IHList = new LinkedList<>();
		
		
		IHList = InstanceHierarchyElements.setInstanceHierarchyList(IHList, IH1);
		
		
		// role class Lib
		
		Description RCL1 = BasicObject.setComponentDescription("Interface Class Library according to Details of the Asset Administration Shell V2.0.");
		Description RCL2 = BasicObject.setComponentDescription("A FileDataReference represents the address to a File. FileDataReference is derived from the AutomationML Interface Class ExternalDataReference that is defined in AutomationML BPR_005E_ExternalDataReference_v1.0.0_2:The interface class “ExternalDataReference” shall be used in order to reference external documents out of the scope of AutomationML.");
		
		AttributeType attrRC = RoleClass.setRoleClassAttribute("", "", "", RCL2, "");
		List<AttributeType> RCLAttList = new LinkedList<>();
		RCLAttList = RoleClass.setAttributeList(attrRC, null, null, null, null, null, null, null, null, null);
		RoleFamilyType RoleClassFamily = RoleClass.setRoleFamily("FileDataReference", "AutomationMLBPRInterfaceClassLib/ExternalDataReference", RCL2, RCLAttList);
		
		List<RoleFamilyType> RoleClassFamilyList =  new LinkedList<>();
		RoleClassFamilyList= RoleClass.setRoleFamilyList(RoleClassFamilyList, RoleClassFamily);
		List<RoleClassLib>RoleClassLibraries= new LinkedList<>();
		RoleClassLib RoleClassLib1 = RoleClass.settingRoleClasslib("AssetAdministrationShellInterfaceClassLib", null,RCL1 , "1.0.0", RoleClassFamilyList);
		
		RoleClassLibraries = RoleClass.setRoleClassLibList(RoleClassLibraries, RoleClassLib1);
		
		
		
		
		// interfaceclassLib
		Description IFL1 = BasicObject.setComponentDescription("Interface Class Library according to Details of the Asset Administration Shell V2.0.");
		Description IFL2 = BasicObject.setComponentDescription("A FileDataReference represents the address to a File. FileDataReference is derived from the AutomationML Interface Class ExternalDataReference that is defined in AutomationML BPR_005E_ExternalDataReference_v1.0.0_2:The interface class “ExternalDataReference” shall be used in order to reference external documents out of the scope of AutomationML.");
		
		AttributeType attrIF = InterfaceClass.setInterfaceClassAttribute("", "", "", IFL2, "");
		List<AttributeType> IFAttList = new LinkedList<>();
		IFAttList = InterfaceClass.setAttributeList(attrIF, null, null, null, null, null, null, null, null, null);
		InterfaceFamilyType InterfaceFamily = InterfaceClass.setInterfaceFamily("FileDataReference", "AutomationMLBPRInterfaceClassLib/ExternalDataReference", IFL2, IFAttList);
		
		List<InterfaceFamilyType> InterfaceClassFamilyList =  new LinkedList<>();
		InterfaceClassFamilyList= InterfaceClass.setInterfaceFamilyList(InterfaceClassFamilyList, InterfaceFamily);
		List<InterfaceClassLib>interfaceClassLibraries= new LinkedList<>();
		InterfaceClassLib interfaceClassLib1 = InterfaceClass.setInterfaceClassLib("AssetAdministrationShellInterfaceClassLib", null,IFL1 , "1.0.0", InterfaceClassFamilyList);
		
		interfaceClassLibraries = InterfaceClass.setInterfaceClassLibList(interfaceClassLibraries, interfaceClassLib1);
		
		
		
		
		//SystemUnitClassLib
		
		Description descSysClass2 = BasicObject.setComponentDescription("An AAS Data Specification template for IEC61369. A template consists of the DataSpecificationContent containing the additional attributes to be added to the element instance that references the data specification template and meta information about the template itself (this is why DataSpecification inherits from Identifiable). In UML these are two separated classes.");
		Description descSUF1 = BasicObject.setComponentDescription("Identifying string of the element within its name space. Constraint AASd-001: In case of a referable element not being an identifiable element this id is mandatory and used for referring to the element in its name space. Constraint AASd-002: idShort shall only feature letters, digits, underscore (\"_\"); starting mandatory with a letter. Constraint AASd-003: idShort shall be matched case-insensitive. Note: In case of an identifiable element idShort is optional but recommended to be defined. It can be used for unique reference in its name space and thus allows better usability and a more performant implementation. In this case it is similar to the “BrowserPath” in OPC UA.");
		Description descSUF2 = BasicObject.setComponentDescription("The category is a value that gives further meta information w.r.t. to the class of the element. It affects the expected existence of attributes and the applicability of constraints.");
		Description descSUF3 = BasicObject.setComponentDescription("Description or comments on the element. The description can be provided in several languages.");
		Description descSUF4 = BasicObject.setComponentDescription("Abstract attribute class for identification. Has the subattributes id and idType.");
		Description descSUF5 = BasicObject.setComponentDescription("Identifier of the element. Its type is defined in idType. Id is a subproperty of identification.");
		Description descSUF6 = BasicObject.setComponentDescription("Type of the Identifier, e.g. URI, IRDI etc. The supported Identifier types are defined in the enumeration “IdentifierType”. IdType is a subproperty of identification.");
		Description descSUF7 = BasicObject.setComponentDescription("Abstract attribute for administration. Has the subattributes revision and version.");
		Description descSUF8 = BasicObject.setComponentDescription("Revision of the element. Constraint AASd-005: A revision requires a version. This means, if there is no version there is no revision neither. Revision is a subproperty of administration");
		Description descSUF9 = BasicObject.setComponentDescription("Version of the element. Version is a subproperty of administration.");
		AttributeType SUF1Attr_1 = SystemUnitClass.setSystemUnitAttribute("idShort", "xs:string", null, descSUF1, "AAS:Referable/idShort");
		AttributeType SUF1Attr_2 = SystemUnitClass.setSystemUnitAttribute("category", "xs:string", "", descSUF2, "AAS:Referable/category");
		AttributeType SUF1Attr_3 = SystemUnitClass.setSystemUnitAttribute("description", "xs:string", "", descSUF3, "AAS:Referable/description");
		AttributeType SUF1Attr_3a = SystemUnitClass.setSystemUnitAttribute("aml-lang=EN", "xs:string", "", null, null);
		AttributeType SUF1Attr_3b = SystemUnitClass.setSystemUnitAttribute("aml-lang=DE", "xs:string", "", null, null);
		SUF1Attr_3 = InstanceHierarchyElements.linkAttribute(SUF1Attr_3, SUF1Attr_3a);
		SUF1Attr_3 = InstanceHierarchyElements.linkAttribute(SUF1Attr_3, SUF1Attr_3b);
		AttributeType SUF1Attr_4 = SystemUnitClass.setSystemUnitAttribute("identification", null, null, descSUF4, "AAS:Identifiable/identification");
		AttributeType SUF1Attr_4a = SystemUnitClass.setSystemUnitAttribute("id", "xs:string", "http://admin-shell.io/DataSpecificationTemplates/DataSpecificationIEC61360", descSUF5, "AAS:Identifier/id");
		AttributeType SUF1Attr_4b = SystemUnitClass.setSystemUnitAttribute("idType", "xs:string", "URI", descSUF6, "AAS:Identifier/idType");
		SUF1Attr_4 = InstanceHierarchyElements.linkAttribute(SUF1Attr_4, SUF1Attr_4a);
		SUF1Attr_4 = InstanceHierarchyElements.linkAttribute(SUF1Attr_4, SUF1Attr_4b);
        AttributeType SUF1Attr_5 = SystemUnitClass.setSystemUnitAttribute("administration", null, null, descSUF7, "AAS:Identifiable/administration");
        AttributeType SUF1Attr_5a = SystemUnitClass.setSystemUnitAttribute("revision", "xs:string", "", descSUF8, "AAS:AdministrativeInformation/revision");
        AttributeType SUF1Attr_5b = SystemUnitClass.setSystemUnitAttribute("version", "xs:string", "", descSUF9, "AAS:AdministrativeInformation/version");
        SUF1Attr_5 = InstanceHierarchyElements.linkAttribute(SUF1Attr_5, SUF1Attr_5a);
        SUF1Attr_5 = InstanceHierarchyElements.linkAttribute(SUF1Attr_5, SUF1Attr_5b);
		
        Description descSUF2Attr_0= BasicObject.setComponentDescription("The content of an AAS Data Specification template for IEC61360.");
        Description descSUF2Attr_1= BasicObject.setComponentDescription("Identifies the attribute hierarchy for preferredName in above attribute hierachy. Subordinate attributes are designated by the country code information (see aml-lang literal).");
        Description descSUF2Attr_2= BasicObject.setComponentDescription("Identifies the attribute for shortName in above attribute hierarchy.");
        Description descSUF2Attr_3 = BasicObject.setComponentDescription("Identifies the attribute for unit in above attribute hierarchy.");
        Description descSUF2Attr_4 = BasicObject.setComponentDescription("Identifies the attribute for unitId in above attribute hierarchy in its string serialization.");
        Description descSUF2Attr_5 = BasicObject.setComponentDescription("Identifies the attribute for sourceOfDefinition in above attribute hierachy. Subordinate attributes are designated by the country code information (see aml-lang literal).");
        Description descSUF2Attr_6 = BasicObject.setComponentDescription("Identifies the attribute for symbol in above attribute hierarchy.");
        Description descSUF2Attr_7 =  BasicObject.setComponentDescription("Identifies the attribute for dataType in above attribute hierarchy");
        Description descSUF2Attr_8 =  BasicObject.setComponentDescription("Identifies the attribute for definition in above attribute hierachy. Subordinate attributes are designated by the country code information (see aml-lang literal).");
        Description descSUF2Attr_9 =  BasicObject.setComponentDescription("Identifies the attribute for valueFormat in above attribute hierarchy.");
        Description descSUF2Attr_10 =  BasicObject.setComponentDescription("Identifies the attribute for valueList in above attribute hierarchy.");
        Description descSUF2Attr_11 =  BasicObject.setComponentDescription("The attribute value.");
        Description descSUF2Attr_12 =  BasicObject.setComponentDescription("The id for the value.");
        
        AttributeType SUF2Attr_1 = SystemUnitClass.setSystemUnitAttribute("preferredName", "xs:string", null, descSUF2Attr_1, "IEC:DataSpecificationIEC61360/preferredName");
        AttributeType SUF2Attr_2 = SystemUnitClass.setSystemUnitAttribute("shortName", "xs:string", null, descSUF2Attr_2, "IEC:DataSpecificationIEC61360/shortName");
        AttributeType SUF2Attr_3 = SystemUnitClass.setSystemUnitAttribute("unit", "xs:string", null, descSUF2Attr_3, "IEC:DataSpecificationIEC61360/unit");
        AttributeType SUF2Attr_4 = SystemUnitClass.setSystemUnitAttribute("unitId", "xs:string", null, descSUF2Attr_4, "IEC:DataSpecificationIEC61360/unitId");
        AttributeType SUF2Attr_5 = SystemUnitClass.setSystemUnitAttribute("sourceOfDefinition", "xs:string", null, descSUF2Attr_5, "IEC:DataSpecificationIEC61360/sourceOfDefinition");
        AttributeType SUF2Attr_6 = SystemUnitClass.setSystemUnitAttribute("symbol", "xs:string", null, descSUF2Attr_6, "IEC:DataSpecificationIEC61360/symbol");
        AttributeType SUF2Attr_7 = SystemUnitClass.setSystemUnitAttribute("dataType", "xs:string", null, descSUF2Attr_7, "IEC:DataSpecificationIEC61360/dataType");
        AttributeType SUF2Attr_8 = SystemUnitClass.setSystemUnitAttribute("definition", "xs:string", null, descSUF2Attr_8, "IEC:DataSpecificationIEC61360/definition");
        AttributeType SUF2Attr_9 = SystemUnitClass.setSystemUnitAttribute("valueFormat", "xs:string", null, descSUF2Attr_9, "IEC:DataSpecificationIEC61360/valueFormat");
        AttributeType SUF2Attr_10 = SystemUnitClass.setSystemUnitAttribute("valueList", "xs:string", null, descSUF2Attr_10, "IEC:DataSpecificationIEC61360/valueList");
        AttributeType SUF2Attr_11 = SystemUnitClass.setSystemUnitAttribute("value", "xs:string", null, descSUF2Attr_11, "IEC:DataSpecificationIEC61360/value");
        AttributeType SUF2Attr_12 = SystemUnitClass.setSystemUnitAttribute("valueId", "xs:string", null, descSUF2Attr_12, "IEC:DataSpecificationIEC61360/valueId");
        		
        
        
		SystemUnitClassLib systemClass1 = SystemUnitClass.settingSystemUnitClassLib("AssetAdministrationShellSystemUnitClasses", null, null, "0", null);
		
		List<AttributeType> SUFAttList = new LinkedList<>();
		List<AttributeType> SUF2AttList = new LinkedList<>();
		List<SystemUnitClassLib> SUCList = new LinkedList<>();
		List<SystemUnitFamilyType> SUFList = new LinkedList<>();
		List<SystemUnitFamilyType> SUFList2 = new LinkedList<>();
		
		SUFAttList = SystemUnitClass.setAttributeList(SUF1Attr_1, SUF1Attr_2, SUF1Attr_3, SUF1Attr_4, SUF1Attr_5, null, null, null, null, null);
		SUF2AttList = SystemUnitClass.setAttributeList(SUF2Attr_1, SUF2Attr_2, SUF2Attr_3, SUF2Attr_4, SUF2Attr_5, SUF2Attr_6, SUF2Attr_7, SUF2Attr_8, SUF2Attr_9, SUF2Attr_10);
		SUF2AttList.add(SUF2Attr_11);
		SUF2AttList.add(SUF2Attr_12);
		
		SystemUnitFamilyType systemUniitFamily1 = SystemUnitClass.setSystemUnitFamily("DataSpecificationIEC61360Template", "AssetAdministrationShellRoleClassLib/DataSpecification", descSysClass2, SUFAttList);
		SystemUnitFamilyType systemUniitFamily2 = SystemUnitClass.setSystemUnitFamily("DataSpecificationIEC61360", "AssetAdministrationShellRoleClassLib/DataSpecificationContent", descSUF2Attr_0, SUF2AttList);
		SUFList = SystemUnitClass.setSystemUnitFamilyList(SUFList, systemUniitFamily1);
		SUFList2 = SystemUnitClass.setSystemUnitFamilyList(SUFList2, systemUniitFamily2);
		SystemUnitClassLib systemClass2 = SystemUnitClass.settingSystemUnitClassLib("AssetAdministrationShellDataSpecificationTemplates", null, null, "0", SUFList);
		systemClass2.getSystemUnitClass().addAll(SUFList2);
		
		SUCList = SystemUnitClass.setSystemUnitClassLibList(SUCList, systemClass2);
		SUCList = SystemUnitClass.setSystemUnitClassLibList(SUCList, systemClass1);
		
		
		
		CAEXBasicObject AddInfo = BasicObject.setAdditionalInfo("AutomationMLVersion:2.0");
		FileObject.assignLibraries(fileObject, IHList, SUCList,interfaceClassLibraries, RoleClassLibraries);
		fileObject.getAdditionalInformation().add(AddInfo);
		FileObject.writeFileObjectOutput(fileObject,context);
		
		
		
		FileObject.writeOutputtoFile(fileObject,context,"Output.xml");
		
		
		
	}

	

}
