package com.iss.training.spring.configuration;

import com.iss.training.spring.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

    @Bean
    public User user(){
        User user = new User();
        user.setName("username.configured");
        return user;
    }

}
