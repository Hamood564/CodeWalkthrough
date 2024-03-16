package test_CAEX;

import java.io.File;
import java.util.Date;

import de.dke.caex.Book;
import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Marshaller;

public class testimplementation {
	public static void main(String[] args) throws JAXBException {
		Book book = new Book();
		book.setName("Book1");
	    book.setAuthor("Author1");
	    book.setDate(new Date());
	    
	    JAXBContext context = JAXBContext.newInstance(Book.class);
	    Marshaller mar = context.createMarshaller();
	    mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
	    mar.marshal(book, System.out);
	    
		
	}

}
