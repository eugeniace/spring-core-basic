package com.iss.training.spring;

import com.iss.training.spring.beans.User;
import com.iss.training.spring.configuration.DemoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfiguration.class );
        context.scan("com.iss.training.spring");

        User user = (User) context.getBean("user");

        System.out.println("user=" +user);

        context.close();
    }
}
