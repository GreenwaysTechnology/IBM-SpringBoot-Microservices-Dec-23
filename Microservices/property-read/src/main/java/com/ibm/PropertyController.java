package com.ibm;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/read")
public class PropertyController {

    @Value("${vmartin.name}")
    String name;

    @Value("${greeting.message}")
    String message;

    @GetMapping()
    public String getProperty() {
        return message + name;
    }
}
