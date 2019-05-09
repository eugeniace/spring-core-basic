package com.iss.training.spring.beans;

public class Info {
    private String env;

    public Info(String env){
        this.env = env;
    }
    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    @Override
    public String toString() {
        return "Info{" +
                "env='" + env + '\'' +
                '}';
    }
}
