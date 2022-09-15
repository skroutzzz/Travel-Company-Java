
package com.travelcompany.eshop.domain;


public enum CustomerCategory {
    INDIVIDUAL("Individual Customer"), 
    BUSINESS("Business Customer");

    public static CustomerCategory valueof(String individual) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    private final String customerType;
    
    private CustomerCategory(String customerType){
        this.customerType = customerType;
    }
    
    /**
     *
     * @return 
     */
    @Override
    public String toString(){
        return customerType;
    }
}
