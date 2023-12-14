package com.ibm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    //http://localhost:8080/api/customers/search?city=Coimbatore
    @GetMapping("/search")
    public String filterByCity(@RequestParam("city") String city) {
        return city;
    }
}
