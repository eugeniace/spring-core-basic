package com.iss.training.spring.configuration;

import com.iss.training.spring.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class DemoConfiguration {

    @Bean
   // @Scope("prototype")
    public User user(){
        User user = new User();
        user.setName("username.configured");
        return user;
    }

    @Bean
    public String redirectURL (){
        return "http://mysite.com";
    }
}
