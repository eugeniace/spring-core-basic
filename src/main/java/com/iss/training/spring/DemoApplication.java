package com.iss.training.spring;

import com.iss.training.spring.beans.User;
import com.iss.training.spring.cdl.ContextualizedDependencyLookup;
import com.iss.training.spring.cdl.ManagedComponent;
import com.iss.training.spring.configuration.DemoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.xml.ws.handler.MessageContext;

public class DemoApplication {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfiguration.class);

        // dependency pull
        User user = (User) context.getBean("user");

        System.out.println("user using DP = " +user);
        
        // dependency lookup
        ManagedComponent mc = new ContextualizedDependencyLookup();
        mc.performLookup(context);

        user = mc.getUser();

        System.out.println("user using CDL = " +user);
    }
}
