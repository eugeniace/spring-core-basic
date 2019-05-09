package com.iss.training.spring.configuration;

import com.iss.training.spring.beans.MovieCatalog;
import com.iss.training.spring.enums.Format;
import com.iss.training.spring.qualifiers.MovieQualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MovieConfiguration {

    @Bean
    @MovieQualifier(format = Format.VHS, genre = "comedy")
    public MovieCatalog comedies(){
        MovieCatalog movieCatalog = new MovieCatalog();
        List<String> names = new ArrayList<>() ;
        names.add("Long Shot");
        names.add("Spider-Man: Far from Home");
        movieCatalog.setNames(names);
        return movieCatalog;
    }

    @Bean
    @MovieQualifier(format = Format.DVD, genre = "comedy")
    public MovieCatalog drama(){
        MovieCatalog movieCatalog = new MovieCatalog();
        List<String> names = new ArrayList<>() ;
        names.add("The Godfather");
        names.add(" The Godfather: Part II");
        movieCatalog.setNames(names);
        return movieCatalog;
    }
}
