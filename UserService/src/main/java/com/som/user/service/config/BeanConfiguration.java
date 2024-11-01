package com.som.user.service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class BeanConfiguration {

    @Bean
    @LoadBalanced // when more than one instance will be there then it will distribute the load
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
