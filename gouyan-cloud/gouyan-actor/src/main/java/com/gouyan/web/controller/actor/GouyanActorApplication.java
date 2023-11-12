package com.gouyan.web.controller.actor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.anji.captcha", "com.gouyan"})

public class GouyanActorApplication {

    public static void main(String[] args) {
        SpringApplication.run(GouyanActorApplication.class, args);
    }

}
