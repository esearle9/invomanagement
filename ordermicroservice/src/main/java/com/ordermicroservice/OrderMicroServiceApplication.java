package com.ordermicroservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class OrderMicroServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderMicroServiceApplication.class, args);
    }

}
