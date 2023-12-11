package com.ibm.spring;

import com.ibm.spring.beans.Customer;

public class ObjectCreationWithoutSpring {
    public static void main(String[] args) {
        //object creation using new operation
        Customer customer = new Customer();
        //setting data via setters
        customer.setId(1);
        customer.setName("Subramanian");

        //read data
        System.out.println(customer.getId() + " " + customer.getName());

        //setting data via constructor
        customer = new Customer(1,"Ram");

        //read data
        System.out.println(customer.getId() + " " + customer.getName());

    }
}
