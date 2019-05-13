package com.iss.training.spring;

import com.iss.training.spring.beans.User;
import com.iss.training.spring.configuration.DemoConfiguration;
import com.iss.training.spring.configuration.DevConfiguration;
import com.iss.training.spring.configuration.ProdConfiguration;
import com.iss.training.spring.configuration.TestConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                DemoConfiguration.class,
                ProdConfiguration.class,
                TestConfiguration.class,
                DevConfiguration.class);

        User user = (User) context.getBean("userLogged");

        System.out.println("user=" +user);
    }
}
