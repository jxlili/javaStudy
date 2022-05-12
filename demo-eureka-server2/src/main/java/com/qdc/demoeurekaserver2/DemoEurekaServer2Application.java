package com.qdc.demoeurekaserver2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DemoEurekaServer2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaServer2Application.class, args);
    }

}
