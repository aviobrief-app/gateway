package com.aviobrief.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class AviobriefGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(AviobriefGatewayApplication.class, args);
    }

}
