package com.qdc.demoeurekaconsumerfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "eureka-provider1")
public interface UserClient {
    @RequestMapping(value = "/port")
    public String hello();
}
