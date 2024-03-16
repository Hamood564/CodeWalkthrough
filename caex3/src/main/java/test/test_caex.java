package test;

import generated.CAEXFile;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class test_caex {
	
	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
		//create the context for the marshaller
		 JAXBContext context = JAXBContext.newInstance(CAEXFile.class);

		 //create a new CAEXFile object
		 CAEXFile file = new CAEXFile();
		 //set the name of the file
		 file.setFileName("myFirstCAEXFile.caex");

		 //create a marshaller within the context
		 Marshaller marshaller = context.createMarshaller();
		 //enable formatting of output (indentation, line breaks)
		 marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
		 //marshall the content to the terminal
		 marshaller.marshal(file, System.out); 
	}

}
