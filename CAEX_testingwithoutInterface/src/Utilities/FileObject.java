package Utilities;

import java.io.File;
import java.util.List;

import javax.xml.transform.Result;

import de.dke.caex.CAEXFile;
import de.dke.caex.CAEXFile.InstanceHierarchy;
import de.dke.caex.CAEXFile.InterfaceClassLib;
import de.dke.caex.CAEXFile.RoleClassLib;
import de.dke.caex.CAEXFile.SystemUnitClassLib;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class FileObject {
	public static JAXBContext context;
	public static CAEXFile fileObject;
	
	public static JAXBContext setContext() throws JAXBException {
		context = JAXBContext.newInstance(CAEXFile.class);
		return context;
	}


	public static CAEXFile setFileObject(String Name, String SchemaVersion) {
		
		//Instantiate the XML file object
		CAEXFile fileObject = new CAEXFile();
		fileObject.setFileName(Name);
		fileObject.setSchemaVersion(SchemaVersion);
		return fileObject;
	}
	
	public static void assignLibraries (CAEXFile fileObject,List<InstanceHierarchy> instanceHierarchies, 
			List<SystemUnitClassLib> systemUnitClassLibraries, List<InterfaceClassLib> interfaceClassLibraries,
			List<RoleClassLib> roleClassLibraries) {
		
		if (instanceHierarchies != null) {
			fileObject.getInstanceHierarchy().addAll(instanceHierarchies);
		}
		if (systemUnitClassLibraries != null) {
			fileObject.getSystemUnitClassLib().addAll(systemUnitClassLibraries);
		}
		if (interfaceClassLibraries != null) {
			fileObject.getInterfaceClassLib().addAll(interfaceClassLibraries);
		}
		if (roleClassLibraries != null) {
			fileObject.getRoleClassLib().addAll(roleClassLibraries);
		}
		
	}
	
	public static void writeFileObjectOutput (CAEXFile fileObject,JAXBContext context) throws JAXBException {
		
		//Final Marshal to XML file Object--Keep at last
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//		if (Output != null ) {
//			marshaller.marshal(fileObject, Output); //write to output
//		}
//		else {
			marshaller.marshal(fileObject, System.out);
//		}
		
		
	}
	
	public static void writeOutputtoFile (CAEXFile fileObject,JAXBContext context,String FIlename) throws JAXBException {
		Marshaller marshaller = context.createMarshaller();
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		File file = new File(FIlename);
		marshaller.marshal(fileObject, file);
		
	}
}
