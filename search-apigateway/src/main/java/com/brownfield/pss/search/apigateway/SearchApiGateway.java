package com.brownfield.pss.search.apigateway;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
@CrossOrigin
@EnableSwagger2 
public class SearchApiGateway {
	
	private static final Logger logger=LoggerFactory.getLogger(SearchApiGateway.class);
	
	@Bean
	@LoadBalanced
	RestTemplate restTemplate(){
	    return new RestTemplate();
    }
	
	@Bean
	public CustomZuulFilter customFilter() {
		return new CustomZuulFilter();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SearchApiGateway.class, args);
	}
	
	@Bean
	public AlwaysSampler defaultSampler(){
		return new AlwaysSampler();
	}
}

@RestController 
class SearchAPIGatewayController {

	private static final Logger logger=LoggerFactory.getLogger(SearchApiGateway.class);
	
	@Autowired
  	RestTemplate restTemplate;
	
	@RequestMapping("/")
	String greet(HttpServletRequest req){
		return "<H1>Search Gateway Powered By Zuul</H1>"; 
	}
	
	@RequestMapping("/hubongw")
	String getHub(HttpServletRequest req){
		logger.info("Search Request in API gateway from getting hub,forwarding to search-service ");
		String hub  = restTemplate.getForObject("http://search-service/search/hub",String.class);
		return hub;
	}
}

	
