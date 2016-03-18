package com.SpringAnnotation.service;

import org.springframework.stereotype.Component;

@Component
public class HelloWomanService {
	
	public String sayHello(){
		return "Woman";
	}

}
