
package com.travelcompany.eshop.service.impl;

import com.travelcompany.eshop.domain.Airports;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.CustomerCategory;
import com.travelcompany.eshop.domain.Itinerary;
import com.travelcompany.eshop.domain.PaymentMethod;
import com.travelcompany.eshop.domain.Ticket;
import com.travelcompany.eshop.exception.CustomerException;
import com.travelcompany.eshop.repository.CustomerRepository;
import com.travelcompany.eshop.repository.ItineraryRepository;
import com.travelcompany.eshop.repository.TicketRepository;
import com.travelcompany.eshop.repository.impl.CustomerRepositoryImpl;
import com.travelcompany.eshop.repository.impl.ItineraryRepositoryImpl;
import com.travelcompany.eshop.repository.impl.TicketRepositoryImpl;
import com.travelcompany.eshop.service.TravelService;
import com.travelcompany.eshop.utility.GeneralUtility;
import java.math.BigDecimal;
import java.time.LocalDateTime;


public class TravelServiceImpl implements TravelService {
    
     private final CustomerRepository customerRepository;
     private final ItineraryRepository itineraryRepository;
     private final TicketRepository ticketRepository;
    
     public TravelServiceImpl(){
        customerRepository = new CustomerRepositoryImpl();
        itineraryRepository = new ItineraryRepositoryImpl();
        ticketRepository = new TicketRepositoryImpl();
    }
     
    @Override
    public void loadInitialCustomerData() {
       for (String currentCustomer: GeneralUtility.customers){
             String words[] = currentCustomer.split(",");
             //long id, String firstName, String surname, String address, String email, String nationality, CustomerCategory category
             try{
                Customer customer = new Customer(
                        Long.parseLong(words[0]), words[1], words[2], words[3], words[4], words[5], CustomerCategory.valueOf(words[6]));
                if (GeneralUtility.isValidcustomer(customer))
                      customerRepository.addCustomer(customer);
             }
             catch(CustomerException customerException){
                 System.out.println("The customer has not been added");
             }
          }
    }
     
     @Override
     public String displayCustomers() {
        StringBuilder returnValue= new StringBuilder();
        returnValue.append("Available customers \n");
        for(Customer customer: customerRepository.readCustomer()){
            returnValue.append(customer);
            returnValue.append("\n");
            
        }
        returnValue.append("-------------------------------------------\n");
        return returnValue.toString();
    }

    @Override
    public void loadInitialItineraryData() {
        for (String currentItinerary: GeneralUtility.itinerarys){
             String words[] = currentItinerary.split(",");
             //long itineraryId, Airports departureAirportCode, Airports destinationAirportCode, LocalDateTime date, String airline, BigDecimal basicPrice
             itineraryRepository.addItinerary( new Itinerary(
                     Long.parseLong(words[0]), Airports.valueOf(words[1]), Airports.valueOf(words[2]), LocalDateTime.parse(words[3]), words[4], new BigDecimal(words[5])));
          }   
    }

    @Override
    public Ticket createTicket(long ticketId, long customerId, long itineraryId, PaymentMethod paymentMethod) {
        Ticket ticket = new Ticket();
        ticket.setTicketId(ticketId);
        
        Customer customer = customerRepository.readCustomer(customerId);
        if (customer == null) return null;
        ticket.setCustomer(customer);
         
        Itinerary itinerary = itineraryRepository.readItinerary(itineraryId);
        if(itinerary == null) return null;
        
        ticket.setItinerary(itinerary);
        ticket.setPaymentMethod(paymentMethod);
        ticket.setBasicPrice(itinerary.getBasicPrice());
        
        if(ticket.getCustomer().getCategory() == CustomerCategory.BUSINESS && ticket.getPaymentMethod() == PaymentMethod.CREDIT)
            ticket.setDiscount(new BigDecimal("0.2"));
        else if(ticket.getCustomer().getCategory() == CustomerCategory.BUSINESS && ticket.getPaymentMethod() == PaymentMethod.CASH)
            ticket.setDiscount(new BigDecimal("0.1"));
        
        else if(ticket.getCustomer().getCategory() == CustomerCategory.INDIVIDUAL && ticket.getPaymentMethod() == PaymentMethod.CREDIT)
            ticket.setDiscount(new BigDecimal("-0.1"));
        else if(ticket.getCustomer().getCategory() == CustomerCategory.INDIVIDUAL && ticket.getPaymentMethod() == PaymentMethod.CASH)
            ticket.setDiscount(new BigDecimal("-0.2"));
        
        //BigDecimal basicPrice = new BigDecimal(ticket.getBasicPrice());
        //BigDecimal discount = new BigDecimal("ticket.getDiscount()");
        BigDecimal multiply = new BigDecimal("1");
        BigDecimal paymentAmount = new BigDecimal("0");
        
        multiply = ticket.getBasicPrice().multiply(ticket.getDiscount());
        paymentAmount = ticket.getBasicPrice().subtract(multiply);
        
        ticket.setPaymentAmount(paymentAmount);
        ticketRepository.addTicket(ticket);
        
        return ticket;
        
//            if(ticket.getCustomer().getCategory() == CustomerCategory.INDIVIDUAL){
//            bookTicket.setDiscount(new BigDecimal("0.1"));   //bookTicket.getDiscount()
//            }    
    }

    @Override
    public String displayTicketsCustomer(long customerId) {
        Customer customer = customerRepository.readCustomer(customerId);
        StringBuilder returnValue= new StringBuilder();
        returnValue.append(customer).append("\n");       
        for (Ticket ticket: ticketRepository.readTicket()){
            if (ticket.getCustomer().getId() == customerId)
                    returnValue.append(ticket).append("\n");
        }
        return returnValue.toString();
    }

    @Override
    public String displayTicket(long ticketId) {
        Ticket ticket = ticketRepository.readTicket(ticketId);
        StringBuilder returnString = new StringBuilder();
        returnString.append("Ticket No. ").append(ticket.getTicketId()).append("\n"); 
        if(ticket.getTicketId() == ticketId)
            returnString.append(ticket).append("\n");
        
       
        return returnString.toString();
    }

    @Override
    public String displayItineraries() {
       StringBuilder returnValue= new StringBuilder();
        returnValue.append("Available itineraries\n");
        for(Itinerary itinerary: itineraryRepository.readItinerary()){
            returnValue.append(itinerary);
            returnValue.append("\n");
        }
        returnValue.append("-------------------------------------------\n");
        return returnValue.toString();
    }

    @Override
    public String displayCustomersNoTicket(long customerId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String displayCustomerMostTicket(long customerId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String displayCustomerLargestCost(long customerId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String displayTickets() {
        StringBuilder returnValue= new StringBuilder();
        returnValue.append("These are the tickets \n");
        for(Ticket ticket: ticketRepository.readTicket()){
            returnValue.append(ticket);
            returnValue.append("\n");
            
        }
        returnValue.append("-------------------------------------------\n");
        return returnValue.toString();
    }

    @Override
    public String displayItineraryDeparture(Airports departureAirportCode) {
        
        StringBuilder returnValue= new StringBuilder();
        returnValue.append("Itineraries from: " );
        for(Itinerary itinerary: itineraryRepository.readItineraryDeparture(departureAirportCode)){
            returnValue.append(itinerary);
            returnValue.append("\n");
        }
        returnValue.append("-------------------------------------------\n");
        return returnValue.toString();
        
    }

    @Override
    public String displayItineraryDestination(Airports destinationAirportCode) {
        StringBuilder returnValue= new StringBuilder();
        returnValue.append("Itineraries to: " );
        for(Itinerary itinerary: itineraryRepository.readItineraryDestination(destinationAirportCode)){
            returnValue.append(itinerary);
            returnValue.append("\n");
        }
        returnValue.append("-------------------------------------------\n");
        return returnValue.toString();
    }
          
}
