package com.iss.training.spring.configuration;

import com.iss.training.spring.beans.Info;
import com.iss.training.spring.beans.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class DemoConfiguration {

    @Bean
    public User user(){
        User user = new User();
        user.setName("username.configured");
        return user;
    }

    @Bean
    public User admin(){
        User user = new User();
        user.setName("admin.configured");
        return user;
    }

    @Bean
    @Qualifier("user2")
    public User otherUser2(){
        User user = new User();
        user.setName("otherUser2.configured");
        return user;
    }

    @Bean
    @Qualifier("userGroup")
    public User userg1(){
        User user = new User();
        user.setName("user1.configured");
        return user;
    }

    @Bean
    @Qualifier("userGroup")
    public User userg2(){
        User user = new User();
        user.setName("user2.configured");
        return user;
    }

    @Bean
    @Primary
    Info test(){
        return new Info("UAT");
    }

    @Bean
    Info prod(){
        return new Info("PROD");
    }
}
