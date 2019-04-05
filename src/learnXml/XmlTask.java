package learnXml;

import java.io.File;
import java.io.IOException;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;



public class XmlTask {
    
    public File xmlFile;
    
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
      
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        
        XmlTask obj = new XmlTask();
        obj.xmlFile = new File("newXMLDocument.xml");
        
        
    }
    
    public void changeOfficiantName(String oldName, String oldSurname, String newName, String newSurname)
    throws ParserConfigurationException, SAXException, IOException{
        
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        
        OfficiantHandler handler = new OfficiantHandler();
        parser.parse(xmlFile, handler);
        
        
        for (Officiant o: handler.officiants){
            if(o.firstName.equals(oldName) && o.secondName.equals(oldSurname)){
                o = new Officiant(newName, newSurname);
            }
        }
 
}
    
    
}
