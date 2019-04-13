package learnXml;

import java.io.File;
import java.io.IOException;
import java.util.Calendar;
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
        
        OfficiantHandler officiantHandler = new OfficiantHandler();
        parser.parse(xmlFile, officiantHandler);
        
        
        for (Officiant o: officiantHandler.officiants){
            if(o.firstName.equals(oldName) && o.secondName.equals(oldSurname)){
                o = new Officiant(newName, newSurname);
            }
        }   
    }
    public int earningsTotal(String officiantSecondName, Calendar calendar) 
    throws ParserConfigurationException, SAXException, IOException{
        
        SAXParserFactory factory = SAXParserFactory.newInstance();
        SAXParser parser = factory.newSAXParser();
        
        DateHandler dateHandler = new DateHandler();
        parser.parse(xmlFile, dateHandler);
        
        for (Date d: dateHandler.dates){
            if(d.calendar == calendar && d.officiant.secondName == officiantSecondName){
                
            }
        }
}
    
    
}
