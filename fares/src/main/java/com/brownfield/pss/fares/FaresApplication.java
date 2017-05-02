package com.brownfield.pss.fares;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.brownfield.pss.fares.repository.FaresRepository;

@SpringBootApplication
@EnableDiscoveryClient
public class FaresApplication/* implements CommandLineRunner*/{
	
	@Autowired
	FaresRepository faresRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FaresApplication.class, args);
	}
	
/*
	@Override
	public void run(String... strings) throws Exception {
		Fare[] fares = {
		new Fare("BF100","22-JAN-16", "101"),
		new Fare("BF101","22-JAN-16", "101"),
		new Fare("BF102","22-JAN-16", "102"),
		new Fare("BF103","22-JAN-16", "103"),
		new Fare("BF104","22-JAN-16", "104"),
		new Fare("BF105","22-JAN-16", "105"),
		new Fare("BF106","22-JAN-16", "106")};
		List<Fare> list = Arrays.stream(fares).collect(Collectors.toList());
		list.forEach(fare -> faresRepository.save(fare)); 
			
 		//logger.info("Result: " + faresRepository.getFareByFlightNumberAndFlightDate("BF101","22-JAN-16"));
 
	}*/
}
