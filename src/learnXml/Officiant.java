/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnXml;

import java.util.ArrayList;

/**
 *
 * @author stud
 */
public class Officiant {
    
   public String firstName; 
   public String secondName;
   public ArrayList<Order> orders;
   
   public Officiant(String firstName, String secondName){
       this.firstName = firstName;
       this.secondName = secondName;
   }
}


