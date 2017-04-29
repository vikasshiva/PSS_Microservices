package com.brownfield.pss.checkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CheckinApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(CheckinApplication.class, args);
	}
	
}
