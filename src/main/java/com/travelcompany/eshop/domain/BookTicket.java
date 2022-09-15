
package com.travelcompany.eshop.domain;

import java.math.BigDecimal;


public class BookTicket {
     private Itinerary itinerary;
     private BigDecimal basicPrice;
     private PaymentMethod paymentMethod;
     private BigDecimal discount;
     private Ticket ticket;

    public BookTicket() {
    }

    public BookTicket(Itinerary itinerary, BigDecimal basicPrice, PaymentMethod paymentMethod, BigDecimal discount, Ticket ticket) {
        this.itinerary = itinerary;
        this.basicPrice = basicPrice;
        this.paymentMethod = paymentMethod;
        this.discount = discount;
        this.ticket = ticket;
    }

    public Itinerary getItinerary() {
        return itinerary;
    }

    public void setItinerary(Itinerary itinerary) {
        this.itinerary = itinerary;
    }

    public BigDecimal getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(BigDecimal basicPrice) {
        this.basicPrice = basicPrice;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "BookTicket{" + "itinerary=" + itinerary + ", basicPrice=" + basicPrice + ", paymentMethod=" + paymentMethod + ", discount=" + discount + ", ticket=" + ticket + '}';
    }
     
     
     
}
