package com.example.hello.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
	
	@RequestMapping("/")
	public String home() {
		
		return "Hello World";
	}

}
