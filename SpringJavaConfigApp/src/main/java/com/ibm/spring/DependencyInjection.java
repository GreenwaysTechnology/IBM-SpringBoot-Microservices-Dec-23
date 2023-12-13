package com.ibm.spring;

import com.ibm.spring.beans.Address;
import com.ibm.spring.beans.Customer;
import com.ibm.spring.beans.CustomerService;
import com.ibm.spring.beans.HelloWorld;
import com.ibm.spring.beans.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependencyInjection {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        System.out.println("Spring Container is ready");
        Customer customer = context.getBean(Customer.class);
        customer.setId(1);
        customer.setName("Subramanain");
        customer.setAddress(new Address("Coimbatore"));
        System.out.println(customer);


    }
}
