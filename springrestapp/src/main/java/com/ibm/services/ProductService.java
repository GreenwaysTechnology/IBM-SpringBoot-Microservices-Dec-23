package com.ibm.services;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    //apis
    public List<String> findAll() {
        return List.of("Phone", "Computer");
    }

    public String save() {
        return "Save";
    }

    public String update() {
        return "Update";
    }

    public String remove() {
        return "remove";
    }

}
