
package com.travelcompany.eshop.repository.impl;

import com.travelcompany.eshop.domain.Ticket;
import com.travelcompany.eshop.repository.TicketRepository;
import java.util.ArrayList;
import java.util.List;


public class TicketRepositoryImpl implements TicketRepository{

    private final List<Ticket> tickets;

    public TicketRepositoryImpl() {
         tickets = new ArrayList<>();
    }
    
    
    @Override
    public boolean addTicket(Ticket ticket) {
        for (int index = 0; index < tickets.size(); index++){
            if (tickets.get(index).getTicketId()== ticket.getTicketId() )
                return false;
        }
        tickets.add(ticket);
        return true;
    }

    @Override
    public List<Ticket> readTicket() {
        return tickets;
    }

    @Override
    public Ticket readTicket(long ticketId) {
        for (Ticket ticket:tickets){
            if (ticket.getTicketId() == ticketId){
                   return ticket;
            }
        }
        return null;
    }

    @Override
    public boolean deleteTicket(long ticketId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
