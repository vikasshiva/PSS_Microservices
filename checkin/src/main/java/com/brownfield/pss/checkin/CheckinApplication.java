package com.brownfield.pss.checkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CheckinApplication /*implements CommandLineRunner*/{
	
	public static void main(String[] args) {
		SpringApplication.run(CheckinApplication.class, args);
	}
	
	/*
	@Autowired
	CheckinRepository repository;
	
	@Override
	public void run(String... strings) throws Exception {
		CheckInRecord record = new CheckInRecord("Franc", "Gean","28A",new Date(),"BF101","22-JAN-16",1);
		 
 		CheckInRecord result  = repository.save(record);
			    
	}*/
}
