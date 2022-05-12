package com.qdc.demoeurekazuul.config;

import com.qdc.demoeurekazuul.Filter.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public MyPreFilter myPreFilter(){
        return new MyPreFilter();
    }
    @Bean
    public MyPreFilter2 myPreFilter2(){
        return new MyPreFilter2();
    }
    @Bean
    public MyRoutingFilter myRoutingFilter(){
        return new MyRoutingFilter();
    }
    @Bean
    public MyRoutingFilter2 myRoutingFilter2(){
        return new MyRoutingFilter2();
    }
    @Bean
    public MyErrorFilter myErrorFilter(){
        return new MyErrorFilter();
    }
    @Bean
    public MyPostFilter myPostFilter(){
        return new MyPostFilter();
    }

}
