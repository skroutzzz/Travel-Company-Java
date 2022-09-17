
package com.travelcompany.eshop;


import com.travelcompany.eshop.domain.Airports;
import com.travelcompany.eshop.domain.PaymentMethod;
import com.travelcompany.eshop.service.TravelService;
import com.travelcompany.eshop.service.impl.TravelServiceImpl;




public class TravelCompanyJava {

    public static void main(String[] args) {


      TravelService travel = new TravelServiceImpl();        
      travel.loadInitialCustomerData();
        
      //System.out.println("Display all Customers: \n " + travel.displayCustomers());
      
      travel.loadInitialItineraryData();
      //System.out.println("Display all Itineraries: \n " + travel.displayItineraries());
      
      
     
      
      
//        System.out.println(travel.displayItineraryDeparture(Airports.ATH));
//        System.out.println(travel.displayItineraryDestination(Airports.PAR));
      
//      long customerId = 1;
//      long itineraryId = 2;
//      long ticketId = 1;
      
      travel.createTicket(1, 2, 1, PaymentMethod.CASH);
      travel.createTicket(2, 3, 3, PaymentMethod.CASH);
      travel.createTicket(3, 2, 5, PaymentMethod.CREDIT);
      travel.createTicket(4, 3, 6, PaymentMethod.CREDIT);
      
      
      
      System.out.println(travel.displayTickets());
//      System.out.println(travel.displayTicketsCustomer(2));
//      System.out.println(travel.displayTicket(2));
      
      
    
    
    
    }
    
 
}
