package learnXml;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class OfficiantHandler extends DefaultHandler{
    
    ArrayList<Officiant> officiants;
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("officiant")) {
            String firstName = (attributes.getValue("firstname"));
            String secondName = (attributes.getValue("secondname"));
            officiants.add(new Officiant(firstName, secondName));
            }
        }
    }

    

