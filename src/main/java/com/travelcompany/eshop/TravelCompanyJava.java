
package com.travelcompany.eshop;


import com.travelcompany.eshop.service.TravelService;
import com.travelcompany.eshop.service.impl.TravelServiceImpl;




public class TravelCompanyJava {

    public static void main(String[] args) {


      TravelService travel = new TravelServiceImpl();        
      travel.loadInitialCustomerData();
        
      System.out.println("Display all Customers: \n " + travel.displayCustomers());
      
      travel.loadInitialItineraryData();
      System.out.println("Display all Itineraries: \n " + travel.displayItineraries());
      
      
      long customerId = 1;
      long[] itineraryIds = new long[]{2, 3};
      long ticketId = 1;
      
      travel.createTicket(ticketId, customerId, itineraryIds);
      
      
      //Stack Overflow Error in these 2 methods.
       //System.out.println(travel.displayTicketsCustomer(customerId));
       //System.out.println(travel.displayTickets(ticketId));
      
      
      
      
      
        
        
        
    /**
     *
     */
    
    }
    
    
//    public static String[] customers = { 
//      "1,Maria,Iordanou,Athens,miordanou@mail.com,Greek,INDIVIDUAL"
//      
//  };
}
