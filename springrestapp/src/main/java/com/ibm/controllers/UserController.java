package com.ibm.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @GetMapping
    public List<String> findAll() {
        return List.of("Subramanian", "Murugan");
    }

    @GetMapping("/{name}")
    public String findByName(@PathVariable("name") String name) {
        return name;
    }

}
