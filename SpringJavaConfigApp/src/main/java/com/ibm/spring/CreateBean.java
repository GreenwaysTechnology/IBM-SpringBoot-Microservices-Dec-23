package com.ibm.spring;

import com.ibm.spring.beans.CustomerService;
import com.ibm.spring.beans.HelloWorld;
import com.ibm.spring.beans.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CreateBean {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Spring Container is ready");
        HelloWorld helloWorld = context.getBean(HelloWorld.class);
        System.out.println(helloWorld.sayHello());
        CustomerService customerService = context.getBean(CustomerService.class);
        System.out.println(customerService.findAll());

    }
}
