package com.iss.training.spring.beans;

import org.springframework.beans.factory.InjectionPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ApplicationInfo {
    @Autowired
    @Qualifier("user")
    User user ;

    @Autowired
    @Qualifier("publicUser")
    User publicUser;

    @Bean
    @Qualifier("publicUser")
    public User publicUserBean(InjectionPoint point){
        System.out.println("injectionPoint = "+ point);

        User user = new User();
        user.setName("public.user");

        return user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "ApplicationInfo{" +
                "user=" + user +
                '}';
    }
}
