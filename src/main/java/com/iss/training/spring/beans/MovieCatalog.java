package com.iss.training.spring.beans;

import java.util.List;

public class MovieCatalog {
    private List<String> names;

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    @Override
    public String toString() {
        return "MovieCatalog{" +
                "names=" + names +
                '}';
    }
}
