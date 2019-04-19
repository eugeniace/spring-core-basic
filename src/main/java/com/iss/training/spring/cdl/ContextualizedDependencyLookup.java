package com.iss.training.spring.cdl;

import com.iss.training.spring.beans.User;
import org.springframework.beans.factory.BeanFactory;

public class ContextualizedDependencyLookup implements ManagedComponent {
    private User user;

    public void performLookup(BeanFactory container) {
        this.user = (User) container.getBean("user");
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
