
package com.travelcompany.eshop.domain;

import java.util.ArrayList;
import java.util.List;


public class Ticket {
     private long ticketId;
     private Customer customer;
     private final List<BookTicket> bookedTickets = new ArrayList<>();

    public Ticket() {
    }

    public Ticket(long ticketId, Customer customer) {
        this.ticketId = ticketId;
        this.customer = customer;
    }
    
    public List<BookTicket> getBookedTickets() {
        return bookedTickets;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Ticket{" + "ticketId=" + ticketId + ", customer=" + customer + ", bookedTickets=" + bookedTickets + '}';
    }
     
     
}
