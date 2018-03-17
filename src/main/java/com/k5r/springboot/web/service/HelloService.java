package com.k5r.springboot.web.service;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
	public String returnHelloMessage() {
		return "Hello Krishna Reddy!";
	}
}