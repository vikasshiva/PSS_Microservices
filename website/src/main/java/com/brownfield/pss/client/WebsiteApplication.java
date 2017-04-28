package com.brownfield.pss.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.web.client.RestTemplate;

@EnableGlobalMethodSecurity
@SpringBootApplication
public class WebsiteApplication{
	
   	RestTemplate searchClient = new RestTemplate();
	
  	 RestTemplate bookingClient = new RestTemplate();
	
   	RestTemplate checkInClient = new RestTemplate();
	
	 RestTemplate restClient= new RestTemplate();
	
	public static void main(String[] args) {
		SpringApplication.run(WebsiteApplication.class, args);
	}
}