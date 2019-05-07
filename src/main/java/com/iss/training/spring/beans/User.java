package com.iss.training.spring.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class User implements BeanNameAware, ApplicationContextAware {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void init(){
        System.out.println("Enter User.init() ..");
    }

    @PostConstruct
    public void postContruct(){
        System.out.println("Enter User.postContruct() ..");
    }

    public void setBeanName(String s) {
        System.out.println("Setting bean name: "+s);
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Setting applicationContext: "+ applicationContext);
    }

    public void destroy(){
        System.out.println("Enter User.destroy() ..");
    }

    @PreDestroy
    public void preDestroy(){
        System.out.println("Enter User.preDestroy() ..");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
