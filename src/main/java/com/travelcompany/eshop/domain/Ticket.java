
package com.travelcompany.eshop.domain;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;


public class Ticket {
     private long ticketId;
     private Customer customer;
     private Itinerary itinerary;
     private BigDecimal basicPrice;
     private PaymentMethod paymentMethod;
     private BigDecimal discount;
     private BigDecimal paymentAmount;

    public Ticket() {
    }

    public Ticket(long ticketId, Customer customer, Itinerary itinerary, BigDecimal basicPrice, PaymentMethod paymentMethod, BigDecimal discount, BigDecimal paymentAmount) {
        this.ticketId = ticketId;
        this.customer = customer;
        this.itinerary = itinerary;
        this.basicPrice = basicPrice;
        this.paymentMethod = paymentMethod;
        this.discount = discount;
        this.paymentAmount = paymentAmount;
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

    public BigDecimal getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(BigDecimal paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    @Override
    public String toString() {
        return "Ticket{" + "ticketId=" + ticketId + ", customer=" + customer + ", itinerary=" + itinerary + ", basicPrice=" + basicPrice + ", paymentMethod=" + paymentMethod + ", discount=" + discount + ", paymentAmount=" + paymentAmount + '}';
    }
    

 

}
