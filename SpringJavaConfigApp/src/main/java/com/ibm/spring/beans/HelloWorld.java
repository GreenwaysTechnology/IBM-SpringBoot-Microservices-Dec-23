package com.ibm.spring.beans;

import org.springframework.stereotype.Component;

@Component
public class HelloWorld {
    public String sayHello() {
        return "Hello";
    }
}
