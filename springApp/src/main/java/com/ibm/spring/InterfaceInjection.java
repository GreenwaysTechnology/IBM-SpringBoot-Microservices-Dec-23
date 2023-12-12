package com.ibm.spring;

import com.ibm.spring.beans.interfaces.CustomerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class InterfaceInjection {
    public static void main(String[] args) {
        //Load Spring Container:XMLContainer,JavaConfigContainer,BootContainer
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-interfaceandfactory.xml");
        System.out.println("Container is ready");
        //Get the bean from the container.
        CustomerService customer = context.getBean(CustomerService.class);
        //read data
        System.out.println(customer.getCustomerRepository().findAll());

    }
}
