
package com.travelcompany.eshop.domain;


public enum PaymentMethod {
    CASH("Paid with cash"), 
    CREDIT("Paid with Credit Card");
    
    
    private final String payment;
    
    private PaymentMethod(String payment){
        this.payment = payment;
    }
    
    /**
     *
     * @return 
     */
    @Override
    public String toString(){
        return payment;
    }
}
