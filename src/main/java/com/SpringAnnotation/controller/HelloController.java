package com.SpringAnnotation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.SpringAnnotation.service.HelloService;

@Controller
public class HelloController {
	
	@Autowired
	public HelloService helloService;
	
	@RequestMapping("/hello")
    public @ResponseBody String sayHello() {
        return helloService.sayHello()+"hello, world! This com from spring!";
    }

}
