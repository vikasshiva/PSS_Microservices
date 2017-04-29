package com.brownfield.pss.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.client.RestTemplate;

@EnableGlobalMethodSecurity
@SpringBootApplication
@EnableDiscoveryClient
public class WebsiteApplication{
	
	
	@Bean
	@LoadBalanced
    RestTemplate restTemplate(){
	    return new RestTemplate();
    }
	
	
   	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
	}
}