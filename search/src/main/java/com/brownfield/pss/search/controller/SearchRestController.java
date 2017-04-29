package com.brownfield.pss.search.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.brownfield.pss.search.component.SearchComponent;
import com.brownfield.pss.search.entity.Flight;

@CrossOrigin
@RestController
@RequestMapping("/search")
@RefreshScope
class SearchRestController {
	
	private SearchComponent searchComponent;
	
	@Value("${orginairports.shutdown}")
	private String originAirportShutdownList;
	
	
	@Autowired
	public SearchRestController(SearchComponent searchComponent){
		this.searchComponent = searchComponent;
	}
	
	@RequestMapping(value="/get", method = RequestMethod.POST)
	List<Flight> search(@RequestBody SearchQuery query){
		System.out.println("Input : "+ query);
		if(Arrays.asList(originAirportShutdownList.split(",")).contains(query.getOrigin())){
			System.out.println("Given Origin is sutdown");
			return null;
		}
		return searchComponent.search(query);
	}
 
}
