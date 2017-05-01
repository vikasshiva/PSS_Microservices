package com.brownfield.pss.book.proxy;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.brownfield.pss.book.component.Fare;

@FeignClient(name="fares-service")
public interface FareServiceProxy {
	
	@RequestMapping(value="/fares/get",method=RequestMethod.GET)
	Fare getFare(@RequestParam(value="flightNumber") String flightNumber, @RequestParam(value="flightDate") String flightDate);

}
