
package com.travelcompany.eshop;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.CustomerCategory;
import com.travelcompany.eshop.domain.Itinerary;


public class TravelCompanyJava {

    public static void main(String[] args) {
        //(long id, String firstName, String surname, String address, String email, String nationality, CustomerCategory category
        Customer customer = new Customer(9, "Maria", "Iordanou", "Athens", "miordanou@mail.com", "Greek", CustomerCategory.valueOf("INDIVIDUAL"));
        System.out.println("The first customer: " + customer.toString() );
        //System.out.println("The customer is: " + customers[0].toString());
        //Itinerary itinerary = new Itinerary("2,ATH,DUB,2022-07-08,SkyAirlines,235");
    /**
     *
     */
    
    }
    
    
//    public static String[] customers = { 
//      "1,Maria,Iordanou,Athens,miordanou@mail.com,Greek,INDIVIDUAL"
//      
//  };
}
