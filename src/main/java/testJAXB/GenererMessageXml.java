package testJAXB;
import java.io.File; 
import java.util.ArrayList; 
import javax.xml.bind.JAXBContext; 
import javax.xml.bind.JAXBException; 
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
public class GenererMessageXml { 
public static void main(String[] args) throws JAXBException { 
Message message = new Message(); 
message.setFrom("mohamed"); 
message.setNew(true); 
message.setText("hello"); 
message.setTo("ali"); 

JAXBContext context = JAXBContext.newInstance(Message.class); 

Marshaller marshaller = context.createMarshaller(); 

marshaller.setProperty("jaxb.encoding", "UTF-8"); 

marshaller.setProperty("jaxb.formatted.output", true); 

marshaller.marshal(message, new File("message.xml")); 

Unmarshaller unmarshaller = context.createUnmarshaller() ;
Message message1= (Message)unmarshaller.unmarshal(new File("message.xml")) ; 
System.out.println("From = " + message1.getFrom()) ;
System.out.println("To = " + message1.getTo()) ;
System.out.println("Text = " + message1.getText()) ;

} 
}
