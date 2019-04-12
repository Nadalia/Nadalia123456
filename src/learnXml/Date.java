package learnXml;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date {
    
    public int day;
    public int month;
    public int year;
    
    public Calendar calendar;
    public Officiant officiant;
    
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
        
        this.calendar = new GregorianCalendar(year, month-1, day);
    }
}
