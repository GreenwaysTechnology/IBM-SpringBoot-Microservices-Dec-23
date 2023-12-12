package com.ibm.spring;

import com.ibm.spring.beans.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScope {
    public static void main(String[] args) {
        //Load Spring Container:XMLContainer,JavaConfigContainer,BootContainer
        ApplicationContext context = new ClassPathXmlApplicationContext("beans-scope.xml");
        System.out.println("Container is ready");
        //Get the bean from the container.
        Hello helloOne = context.getBean(Hello.class);
        Hello helloTwo = context.getBean(Hello.class);
        Hello helloThree = context.getBean(Hello.class);
        Hello helloFour = context.getBean(Hello.class);

        System.out.println(helloOne.hashCode());
        System.out.println(helloTwo.hashCode());
        System.out.println(helloThree.hashCode());
        System.out.println(helloFour.hashCode());

    }
}
