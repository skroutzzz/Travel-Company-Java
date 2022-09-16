
package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.domain.Ticket;
import java.math.BigDecimal;
import java.util.List;


public interface TicketRepository {
     boolean addTicket(Ticket ticket);
     List<Ticket> readTicket();
     Ticket readTicket(long ticketId);
     //boolean updateTicket(long ticketId, BigDecimal newPrice);
     boolean deleteTicket(long ticketId);
     
}
