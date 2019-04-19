package com.iss.training.spring.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginInfo {
    User user;

    String redirectURL;

    @Autowired
    public LoginInfo(User user){
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getRedirectURL() {
        return redirectURL;
    }

    @Autowired
    public void setRedirectURL(String redirectURL) {
        this.redirectURL = redirectURL;
    }

    @Override
    public String toString() {
        return "LoginInfo{" +
                "user=" + user +
                ", redirectURL='" + redirectURL + '\'' +
                '}';
    }
}
