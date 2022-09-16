
package com.travelcompany.eshop.domain;

import com.travelcompany.eshop.exception.CustomerException;
import com.travelcompany.eshop.utility.GeneralUtility;


public class Customer {
    private long customerId;
    private String firstName;
    private String surname;
    private String address;
    private String email;
    private String nationality;
    private CustomerCategory category;

    public Customer(long id, String firstName, String surname, String address, String email, String nationality, CustomerCategory category) throws CustomerException{
        if (!GeneralUtility.isValidEmail(email))
             throw new CustomerException("Invalid email");
        this.customerId = id;
        this.firstName = firstName;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.nationality = nationality;
        this.category = category;
    }

    public Customer() {
    }

   

    public long getId() {
        return customerId;
    }

    public void setId(long id) {
        this.customerId = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public CustomerCategory getCategory() {
        return category;
    }

    public void setCategory(CustomerCategory category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + customerId + ", firstName=" + firstName + ", surname=" + surname + ", address=" + address + ", email=" + email + ", nationality=" + nationality + ", category=" + category + '}';
    }
    
    
    
}
