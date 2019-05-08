package com.iss.training.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class ApplicationInfo {

    @Autowired
    User user;

    public void process (String username){
        User user = createUser();
        user.setName(username);
        System.out.println("User "+user +" says hello!");
    }

    @Lookup
    public abstract User createUser() ;

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
