package com.ibm.spring.beans.interfaces;


public class CustomerJPARepositoryImpl implements CustomerRepository {
    @Override
    public String findAll() {
        return "CustomerJPARepositoryImpl";
    }
}