package com.iss.training.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

// example for @Service and naming auto detected components
@Service ("service")
public class DBService {

    private String dbname;

    @Autowired
    public DBService(@Qualifier("dbname") String dbname) {
        this.dbname = dbname;
    }

    @Override
    public String toString() {
        return "DBService{" +
                "dbname='" + dbname + '\'' +
                '}';
    }
}
