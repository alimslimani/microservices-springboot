package com.alim.spring.images;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ImagesEurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(ImagesEurekaApplication.class, args);
    }
}
