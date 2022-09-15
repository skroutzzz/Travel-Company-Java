
package com.travelcompany.eshop.repository;

import com.travelcompany.eshop.domain.Customer;
import java.util.List;



public interface CustomerRepository {
    boolean addCustomer (Customer customer);
    List<Customer> readCustomer();
    Customer readCustomer(long customerId);
    //boolean updateCustomer(long customerId, String newEmail);
    boolean deleteCustomer(long customerId);
}
