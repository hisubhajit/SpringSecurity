package com.example.security.resource;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test-resource")
public class TestResource {

	@RequestMapping(value = "/greet", method = RequestMethod.GET)
	public String greet() {
		return "Hello";
	}

}
