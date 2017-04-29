package com.brownfield.pss.book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(basePackages="com.brownfield.pss.book.proxy")
public class BookApplication{
	
	public static void main(String[] args) {
		SpringApplication.run(BookApplication.class, args);
	}

	
}
