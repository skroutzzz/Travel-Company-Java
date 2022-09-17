
package com.travelcompany.eshop.repository.impl;

import com.travelcompany.eshop.domain.Customer;
import com.travelcompany.eshop.domain.CustomerCategory;
import com.travelcompany.eshop.repository.CustomerRepository;
import com.travelcompany.eshop.utility.GeneralUtility;
//import gr.codehub.javaintroduction.utility.GeneralUtility;

import java.util.ArrayList;
import java.util.List;


public class CustomerRepositoryImpl implements CustomerRepository {
   
    private final List<Customer> customers ;

    public CustomerRepositoryImpl() {
         customers = new ArrayList<>();
    }

    
    @Override
     public boolean addCustomer (Customer customer){
        
        for (int index = 0; index < customers.size(); index++){
            if (customers.get(index).getId()== customer.getId() )
                return false;
        }
        
       if (! GeneralUtility.isValidcustomer(customer)) 
           return false;
        customers.add(customer);
        return true;
    }
    
     

    /**
     *
     * @return
     */
    @Override
    public List<Customer> readCustomer(){
        return customers;
    }

    /**
     *
     * @param customerId
     * @return
     */
    @Override
    public Customer readCustomer(long customerId){
//        for (int index = 0; index < customers.size(); index ++){
//            if (customers.get(index).getId() == id)
//                return customers.get(index);
//        }
//        
        for (Customer customer:customers){
            if (customer.getId() == customerId){
                   return customer;
            }
        }
        return null; 
    }
    
    

    @Override
    public boolean deleteCustomer(long customerId) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean customerType(CustomerCategory customerType) {
        for(Customer customer:customers){
            if (customer.getCategory() == customerType.INDIVIDUAL)
                return true;
            else 
                return false;
        }
        
        return false;
    }
    
           
    
}
//if (customer.getCategory() == customerType.BUSINESS)