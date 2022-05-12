package com.qdc.demoeurekaconsumer1.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration      //设置配置类
public class RibbonConfig {

    @Bean
    @LoadBalanced   //开启负载均衡的功能
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

}
