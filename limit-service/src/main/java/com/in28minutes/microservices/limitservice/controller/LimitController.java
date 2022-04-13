package com.in28minutes.microservices.limitservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in28minutes.microservices.limitservice.bean.Limit;
import com.in28minutes.microservices.limitservice.configuration.Configuration;

@RestController
public class LimitController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limit")
	public Limit retrieveLimit() {

		return new Limit(configuration.getMaximum(), configuration.getMinimum());
	}

}
