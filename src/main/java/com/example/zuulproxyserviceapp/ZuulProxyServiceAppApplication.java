package com.example.zuulproxyserviceapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableZuulProxy
//@EnableEurekaClient
public class ZuulProxyServiceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZuulProxyServiceAppApplication.class, args);
    }

//    @Bean
//    public PreFilter preFilter(){
//        return new PreFilter();
//    }
//
//    @Bean
//    public PostFilter postFilter(){
//        return new PostFilter();
//    }
//
//    @Bean
//    public ErrorFilter ErrorFilter(){
//        return new ErrorFilter();
//    }
//
//    @Bean
//    public RouteFilter RouteFilter(){
//        return new RouteFilter();
//    }
}
