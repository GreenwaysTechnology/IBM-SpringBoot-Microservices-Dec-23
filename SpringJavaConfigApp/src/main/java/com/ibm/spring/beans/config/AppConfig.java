package com.ibm.spring.beans.config;

//This is class where we are going to create beans: java config
//AppConfig.java == beans.xml

import com.ibm.spring.beans.CustomerService;
import com.ibm.spring.beans.HelloWorld;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

//<beans>
//@Configuration
//@Import({HelloConfig.class, CustomerConfig.class})
@ComponentScan(basePackages = "com.ibm.spring")
public class AppConfig {
    //write logic to create bean
    //<bean/>
}
//</beans>
