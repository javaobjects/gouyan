package com.gouyan.web.controller.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.anji.captcha", "com.gouyan"})

public class GouyanMovieApplication {

    public static void main(String[] args) {
        SpringApplication.run(GouyanMovieApplication.class, args);
    }

}
