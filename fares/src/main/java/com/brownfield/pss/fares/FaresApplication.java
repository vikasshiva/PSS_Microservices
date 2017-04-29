package com.brownfield.pss.fares;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.brownfield.pss.fares.repository.FaresRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class FaresApplication{
	
	@Autowired
	FaresRepository faresRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FaresApplication.class, args);
	}	
}
