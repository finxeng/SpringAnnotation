package com.SpringAnnotation.service;

import org.springframework.stereotype.Component;

@Component
public class HelloManService {
	
	public String sayHello(){
		return "Man";
	}

}
