
package com.travelcompany.eshop.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class Itinerary {
     private long ticketId;
     private Airports departureAirportCode;
     private Airports destinationAirportCode;
     private LocalDateTime date;
     private String airline;
     private BigDecimal basicPrice;

    public Itinerary() {
    }

    public Itinerary(long ticketId, Airports departureAirportCode, Airports destinationAirportCode, LocalDateTime date, String airline, BigDecimal basicPrice) {
        this.ticketId = ticketId;
        this.departureAirportCode = departureAirportCode;
        this.destinationAirportCode = destinationAirportCode;
        this.date = date;
        this.airline = airline;
        this.basicPrice = basicPrice;
    }

    public long getTicketId() {
        return ticketId;
    }

    public void setTicketId(long ticketId) {
        this.ticketId = ticketId;
    }

    public Airports getDepartureAirportCode() {
        return departureAirportCode;
    }

    public void setDepartureAirportCode(Airports departureAirportCode) {
        this.departureAirportCode = departureAirportCode;
    }

    public Airports getDestinationAirportCode() {
        return destinationAirportCode;
    }

    public void setDestinationAirportCode(Airports destinationAirportCode) {
        this.destinationAirportCode = destinationAirportCode;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public BigDecimal getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(BigDecimal basicPrice) {
        this.basicPrice = basicPrice;
    }

    @Override
    public String toString() {
        return "Itinerary{" + "ticketId=" + ticketId + ", departureAirportCode=" + departureAirportCode + ", destinationAirportCode=" + destinationAirportCode + ", date=" + date + ", airline=" + airline + ", basicPrice=" + basicPrice + '}';
    }

   
     
     
    
}
