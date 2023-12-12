package com.ibm.spring.beans.interfaces;

public class CustomerInMemoryRepositoryImpl implements CustomerRepository {
    @Override
    public String findAll() {
        return "CustomerInMemoryRepositoryImpl";
    }
}