package com.iss.training.spring;

import com.iss.training.spring.beans.ApplicationInfo;
import com.iss.training.spring.beans.User;
import com.iss.training.spring.configuration.DemoConfiguration;
import com.iss.training.spring.configuration.SecondConfiguration;
import com.iss.training.spring.service.DBService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DemoApplication {
    public static void main(String[] args) {

        // send both config classes to the constructor of the context
        // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfiguration.class, SecondConfiguration.class);

        // use register and refresh after the context is built
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(DemoConfiguration.class);
//        context.register(SecondConfiguration.class);
//        context.refresh();

        // constructor uses SecondConfiguration and Import Demo into Second
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SecondConfiguration.class);

//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.register(SecondConfiguration.class);
//        context.scan("com.iss.training.spring");
//        context.refresh();

        User user = (User) context.getBean("user");
        System.out.println("user=" +user);

        User secondUser = (User) context.getBean("secondUser");
        System.out.println("secondUser = "+secondUser);

        ApplicationInfo applicationInfo = context.getBean(ApplicationInfo.class);
        System.out.println("applicationInfo = "+applicationInfo);

        System.out.println("dbservice = "+context.getBean(DBService.class));
        System.out.println("service = "+context.getBean("service"));
    }
}
