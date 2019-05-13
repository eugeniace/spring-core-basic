package com.iss.training.spring.configuration;

import com.iss.training.spring.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("test | uat")
public class TestConfiguration {
    @Bean(name = "userLogged")
    User userLogging(){
        User user = new User();
        user.setName("User.TEST");
        return user;
    }
}
