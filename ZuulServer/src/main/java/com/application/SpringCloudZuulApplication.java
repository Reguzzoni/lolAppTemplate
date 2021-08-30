package com.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableZuulProxy
@SpringBootApplication
@EnableDiscoveryClient
@EnableEurekaClient
@EnableSwagger2
public class SpringCloudZuulApplication {

    public static void main(String[] args) {
    	SpringApplication.run(SpringCloudZuulApplication.class, args);
    }

}
