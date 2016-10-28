package com.payworks.comics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import com.payworks.comics.persistence.SuperHeroRepository;

/**
 * 
 * @author dcarao
 *
 */
@SpringBootApplication
public class App extends SpringBootServletInitializer {
	
	@Autowired
	SuperHeroRepository repository;
	
    public static void main( String[] args ){
    	SpringApplication.run(App.class, args);
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(App.class);
    }    
    
}
