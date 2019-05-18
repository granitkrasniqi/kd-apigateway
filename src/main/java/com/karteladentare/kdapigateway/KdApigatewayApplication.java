package com.karteladentare.kdapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class KdApigatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(KdApigatewayApplication.class, args);
    }

}
