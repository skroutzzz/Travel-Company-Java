
package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Airports;
import com.travelcompany.eshop.domain.Ticket;


public interface TravelService {
    
    void loadInitialCustomerData();
    void loadInitialItineraryData();
    Ticket createTicket(long ticketId, long customerId, long itineraryId);
    
    String displayTicketsCustomer(long customerId);
    //String displayTicket(long ticketId);
    String displayTickets();
    
    String displayItineraries();
    String displayCustomers();
    
    String displayItineraryDeparture(Airports departureAirportCode);
    String displayItineraryDestination(Airports destinationAirportCode);
    
    
    String displayCustomersNoTicket(long customerId);
    String displayCustomerMostTicket(long customerId);
    String displayCustomerLargestCost(long customerId);
    
    
    
    
//void loadInitialCustomerData();
//    void loadInitialItemData();
//    Order createOrder(long orderId, long customerId, long[] itemIds);
//    
//    String displayOrders(long customerId);
//    String displayOrder(long orderId);
//    
//    String displayItems();
//    String displayCustomers();
//    
//    OrderList getOrders(); 
}
