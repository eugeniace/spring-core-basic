package com.iss.training.spring.cdl;

import com.iss.training.spring.beans.User;
import org.springframework.beans.factory.BeanFactory;

public interface ManagedComponent {
    void performLookup(BeanFactory container);
    User getUser();
}
