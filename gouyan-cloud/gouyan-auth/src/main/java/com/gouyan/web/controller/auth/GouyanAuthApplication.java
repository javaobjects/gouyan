package com.gouyan.web.controller.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.anji.captcha", "com.gouyan"})

public class GouyanAuthApplication {

    public static void main(String[] args) {
        SpringApplication.run(GouyanAuthApplication.class, args);
    }

}
