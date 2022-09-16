
package com.travelcompany.eshop.utility;

import com.travelcompany.eshop.domain.Customer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class GeneralUtility {
    
      
  //(long id, String firstName, String surname, String address, String email, String nationality, CustomerCategory category
  public static String[] customers = { 
      "1,Maria,Iordanou,Athens,miordanou@mail.com,Greek,INDIVIDUAL",
      "2,Dimitrios,Dimitriou,Athens,ddimitriou@mail.com,Greek,INDIVIDUAL",
      "3,Ioannis,Ioannou,Athens,iioannou@mail.com,Greek,BUSINESS",
      "4,Antonio,Molinari,Milan,amolinari@mail.com,Italian,INDIVIDUAL",
      "5,Frederico,Rossi,Milan,frossi@mail.com,Italian,INDIVIDUAL",
      "6,Mario,Conti,Rome,mconti@mail.com,Italian,BUSINESS",
      "7,Nathan,Martin,Lyon,nmartin@mail.com,French,BUSINESS",
      "8,Enzo,Collin,Lyon,ecollin@mail.com,French,INDIVIDUAL",
      "9,Frederic,Michel,Athens,fmichel@mail.com,French,INDIVIDUAL"
  };
    //long itineraryId, Airports departureAirportCode, Airports destinationAirportCode, LocalDateTime date, String airline, BigDecimal basicPrice
    public static String[] itinerarys = {
    "1,ATH,PAR,2022-02-22T10:13:35,Skylines,300",
    "2,ATH,LON,2022-02-22T10:13:40,Skylines,420",
    "3,ATH,AMS,2022-02-22T10:13:45,Skylines,280",
    "4,ATH,PAR,2022-02-22T10:14:20,Skylines,310",
    "5,ATH,DUB,2022-02-22T10:14:35,Skylines,880",
    "6,ATH,FRA,2022-02-22T10:14:55,Skylines,380",
    "7,ATH,FRA,2022-02-22T10:15:35,Skylines,350",
    "8,ATH,MEX,2022-02-22T10:16:00,Skylines,1020",
    "9,ATH,DUB,2022-02-22T10:16:35,Skylines,770"
    };
    
     public static boolean isValidEmail(String email){
        String regex = "^(.+)@(.+)$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
     public static boolean isValidcustomer(Customer customer){
        if (customer == null) return false;    
        
  //    if ("administrator".equals(customer.getFirstName())) return false;
        if (customer.getFirstName()!=null && customer.getFirstName().toLowerCase().equals("administrator")) return false;
        if (! isValidEmail(customer.getEmail())) return false;
        if (customer.getEmail().contains("@travelcompany.com")) return false;
        
        return true;
      }
    
    
}
