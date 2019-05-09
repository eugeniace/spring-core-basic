package com.iss.training.spring;

import com.iss.training.spring.beans.ApplicationInfo;
import com.iss.training.spring.beans.User;
import com.iss.training.spring.configuration.DemoConfiguration;
import com.iss.training.spring.configuration.MovieConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfiguration.class, MovieConfiguration.class);

        context.scan("com.iss.training.spring.beans");

        ApplicationInfo user = context.getBean(ApplicationInfo.class);

        System.out.println("user=" +user);
    }
}
