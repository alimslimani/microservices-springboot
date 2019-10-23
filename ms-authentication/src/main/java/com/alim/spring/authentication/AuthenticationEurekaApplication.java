package com.alim.spring.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AuthenticationEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(AuthenticationEurekaApplication.class, args);
    }
}
