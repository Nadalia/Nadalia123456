package learnXml;

import java.util.ArrayList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DateHandler extends DefaultHandler{
    ArrayList<Date> dates;
    Date date;
    
    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
        if (qName.equals("date")) {
            int day = Integer.parseInt(attributes.getValue("day"));
            int month = Integer.parseInt(attributes.getValue("month"));
            int year = Integer.parseInt(attributes.getValue("year"));
            date = new Date(day, month, year);
        }
        if (qName.equals("officiant")) {
            String firstName = (attributes.getValue("firstname"));
            String secondName = (attributes.getValue("secondname"));
            Officiant newOfficiant = new Officiant(firstName, secondName);
            dates.add(new Date(date, newOfficiant));
            }
        }
    }

