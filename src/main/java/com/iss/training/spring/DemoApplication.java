package com.iss.training.spring;

import com.iss.training.spring.beans.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring/bundle-context.xml");

        User user = ctx.getBean("user", User.class);

        System.out.println("user = "+user);
    }
}
