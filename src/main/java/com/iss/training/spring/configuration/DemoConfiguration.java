package com.iss.training.spring.configuration;

import com.iss.training.spring.beans.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@Profile("default")
@PropertySource("classpath:app.properties")
public class DemoConfiguration {

    @Autowired
    Environment env;

    @Bean(name = "userLogged")
    public User user(){
        User user = new User();
        user.setName(env.getProperty("user.nameset")); // take the value from the environment
        return user;
    }

}
