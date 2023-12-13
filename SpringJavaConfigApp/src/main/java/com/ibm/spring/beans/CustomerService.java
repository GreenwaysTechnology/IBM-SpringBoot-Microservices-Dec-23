package com.ibm.spring.beans;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    public String findAll() {
        return "findAll";
    }
}
