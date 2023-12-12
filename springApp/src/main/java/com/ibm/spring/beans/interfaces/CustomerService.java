package com.ibm.spring.beans.interfaces;

public class CustomerService {
    private CustomerRepository customerRepository;

    public CustomerService() {
    }

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerRepository getCustomerRepository() {
        return customerRepository;
    }

    public void setCustomerRepository(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }
}
