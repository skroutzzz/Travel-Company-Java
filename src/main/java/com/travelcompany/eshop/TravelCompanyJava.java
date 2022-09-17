
package com.travelcompany.eshop;


import com.travelcompany.eshop.domain.Airports;
import com.travelcompany.eshop.service.TravelService;
import com.travelcompany.eshop.service.impl.TravelServiceImpl;




public class TravelCompanyJava {

    public static void main(String[] args) {


      TravelService travel = new TravelServiceImpl();        
      travel.loadInitialCustomerData();
        
      System.out.println("Display all Customers: \n " + travel.displayCustomers());
      
      travel.loadInitialItineraryData();
      System.out.println("Display all Itineraries: \n " + travel.displayItineraries());
      
      
     
      
      
        System.out.println(travel.displayItineraryDeparture(Airports.ATH));
        System.out.println(travel.displayItineraryDestination(Airports.PAR));
      
//      long customerId = 1;
//      long itineraryId = 2;
//      long ticketId = 1;
      
      travel.createTicket(1, 2, 1);
      travel.createTicket(2, 4, 3);
      
      
      System.out.println(travel.displayTickets());
      
      //Stack Overflow Error in these 2 methods.
      //System.out.println(travel.displayTicketsCustomer(customerId));
      //System.out.println(travel.displayTickets(ticketId));
    
    
    }
    
 
}
