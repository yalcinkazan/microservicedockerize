package com.microservice.microservicedockerize.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@RequestMapping("/")
	public String getContainerId() {
		 return "CONTAINER ID : " + System.getenv("HOSTNAME");
	}
	
}
