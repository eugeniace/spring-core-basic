package com.iss.training.spring.beans;

public class User {
    private String name;

    public User(){
        System.out.println("In User's constructor ..");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
