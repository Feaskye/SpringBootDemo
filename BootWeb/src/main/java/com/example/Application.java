package com.example;
// import java.util.Arrays;

// import com.example.exception.ServiceException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        
        //ServiceException
        System.out.println("init Spring Boot:");
        
        
        //String[] beanNames = ctx.getBeanDefinitionNames();
        //Arrays.sort(beanNames);
        // for (String beanName : beanNames) {
        //     //System.out.println(beanName);
        // }
       
    }




}
//https://www.cnblogs.com/oskyhg/p/6683629.html