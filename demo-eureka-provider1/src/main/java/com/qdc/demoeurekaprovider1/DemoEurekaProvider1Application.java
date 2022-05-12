package com.qdc.demoeurekaprovider1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
//import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

//@EnableDiscoveryClient 与下作用完全相同 基于spring-cloud-commons，并且在classpath中实现。
@EnableEurekaClient         //标识应用实例
//就是如果选用的注册中心是eureka推荐@EnableEurekaClient，
@SpringBootApplication
//@EnableResourceServer
public class DemoEurekaProvider1Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurekaProvider1Application.class, args);
    }

}
