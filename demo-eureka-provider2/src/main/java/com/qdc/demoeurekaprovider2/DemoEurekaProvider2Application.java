package com.qdc.demoeurekaprovider2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class DemoEurekaProvider2Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaProvider2Application.class, args);
    }

}
