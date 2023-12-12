package com.ibm.spring;

import com.ibm.spring.beans.DatabaseConnection;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCyles {
    public static void main(String[] args) {
        //Load Spring Container:XMLContainer,JavaConfigContainer,BootContainer
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans-lifecycles.xml");
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("beans-lifecycles.xml");
        System.out.println("Container is ready");
        //Get the bean from the container.
        DatabaseConnection databaseConnection = context.getBean(DatabaseConnection.class);

        context.registerShutdownHook();

    }
}
