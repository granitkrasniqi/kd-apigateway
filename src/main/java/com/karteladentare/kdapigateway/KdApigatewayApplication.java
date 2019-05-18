package com.karteladentare.kdapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy // Enable the service to be a Zuul server
public class KdApigatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(KdApigatewayApplication.class, args);
    }

}
