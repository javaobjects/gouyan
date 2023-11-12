package com.example.gouyaneureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class GouyanEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(GouyanEurekaApplication.class, args);
    }

}
