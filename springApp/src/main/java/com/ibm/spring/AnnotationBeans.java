package com.ibm.spring;

import com.ibm.spring.beans.Customer;
import com.ibm.spring.beans.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.annotation.Order;

public class AnnotationBeans {
    public static void main(String[] args) {
        //Load Spring Container:XMLContainer,JavaConfigContainer,BootContainer
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        System.out.println("Container is ready");
        //Get the bean from the container.
        OrderService orderService = context.getBean(OrderService.class);
        //read data
        System.out.println(orderService.findAll());

    }
}
