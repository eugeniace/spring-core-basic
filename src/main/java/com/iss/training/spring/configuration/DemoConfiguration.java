package com.iss.training.spring.configuration;

import com.iss.training.spring.beans.User;
import com.iss.training.spring.processors.InstantiationTracingBeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoConfiguration {

    @Bean (initMethod = "init", destroyMethod = "destroy")
    public User user(){
        User user = new User();
        user.setName("username.configured");
        return user;
    }

    @Bean
    public InstantiationTracingBeanPostProcessor instantiationTracingBeanPostProcessor(){
        return new InstantiationTracingBeanPostProcessor();
    }
}
