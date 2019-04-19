package com.iss.training.spring;

import com.iss.training.spring.beans.LoginInfo;
import com.iss.training.spring.configuration.DemoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfiguration.class);
        context.scan("com.iss.training.spring.beans");

        LoginInfo loginInfo = (LoginInfo) context.getBean("loginInfo");

        System.out.println("loginInfo = " + loginInfo );
    }
}
