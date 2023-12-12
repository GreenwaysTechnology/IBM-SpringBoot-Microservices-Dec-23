package com.ibm.spring;

import com.ibm.spring.beans.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ObjectCreationUsingSpring {
    public static void main(String[] args) {
        //Load Spring Container:XMLContainer,JavaConfigContainer,BootContainer
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-basic.xml");
        System.out.println("Container is ready");
        //Get the bean from the container.
        Customer customer = context.getBean(Customer.class);
        //read data
        System.out.println(customer.getId() + " " + customer.getName());

    }
}
