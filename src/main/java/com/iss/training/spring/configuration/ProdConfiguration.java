package com.iss.training.spring.configuration;

import com.iss.training.spring.beans.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile({"production", "preprod"})
public class ProdConfiguration {
    @Bean(name = "userLogged")
    User  userLogging(){
        User user = new User();
        user.setName("User.PROD");
        return user;
    }

}
