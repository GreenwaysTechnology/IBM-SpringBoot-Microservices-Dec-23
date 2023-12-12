package com.ibm.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanPostProcessor {
    public static void main(String[] args) {
        //Load Spring Container:XMLContainer,JavaConfigContainer,BootContainer
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-beanpostprocessor.xml");
        System.out.println("Container is ready");


    }
}
