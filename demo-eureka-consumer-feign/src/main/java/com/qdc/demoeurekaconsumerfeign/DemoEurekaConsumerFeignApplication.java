package com.qdc.demoeurekaconsumerfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableEurekaClient
@EnableDiscoveryClient
@EnableFeignClients
@SpringBootApplication
public class DemoEurekaConsumerFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoEurekaConsumerFeignApplication.class, args);
	}

}
