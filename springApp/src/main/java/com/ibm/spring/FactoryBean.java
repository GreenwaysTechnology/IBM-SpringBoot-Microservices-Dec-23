package com.ibm.spring;

import com.ibm.spring.beans.AuthService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FactoryBean {
    public static void main(String[] args) {
        //Load Spring Container:XMLContainer,JavaConfigContainer,BootContainer
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-interfaceandfactory.xml");
        System.out.println("Container is ready");
        //Get the bean from the container.
        AuthService authService = context.getBean(AuthService.class);
        //read data
        System.out.println(authService.getUserName());
//        AuthService authService = new AuthService();

    }
}
