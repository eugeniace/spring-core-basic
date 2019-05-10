package com.iss.training.spring.configuration;

import com.iss.training.spring.beans.User;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@Import(DemoConfiguration.class)
@ComponentScan ({"com.iss.training.spring"}) //use base package for scanning
/*@ComponentScan ( basePackages = "com.iss.training.spring",
        includeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = ".*Service")
        // in this case DBService doesn't need to be annotated with @Services
)*/
public class SecondConfiguration {

    @Bean
    User secondUser(){
        User user = new User();
        user.setName("second.user");
        return user;
    }

    @Bean
    @Qualifier("dbname")
    String dbname(){
        return "databaseName";
    }
}
