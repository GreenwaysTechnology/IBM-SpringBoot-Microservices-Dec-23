package com.ibm.controllers;


import com.ibm.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    //apis
    @GetMapping
    public List<String> findAll() {
        return productService.findAll();
    }

    @PostMapping
    public String save() {
        return productService.save();
    }

    @PutMapping
    public String update() {
        return productService.update();
    }

    @DeleteMapping
    public String remove() {
        return productService.remove();
    }
}
