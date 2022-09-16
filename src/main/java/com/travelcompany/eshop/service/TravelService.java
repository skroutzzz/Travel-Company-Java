
package com.travelcompany.eshop.service;

import com.travelcompany.eshop.domain.Ticket;


public interface TravelService {
    
    void loadInitialCustomerData();
    void loadInitialItineraryData();
    Ticket createTicket(long ticketId, long customerId, long[] itineraryIds);
    
    String displayTicketsCustomer(long customerId);
    String displayTickets(long ticketId);
    
    String displayItineraries();
    String displayCustomers();
    
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
