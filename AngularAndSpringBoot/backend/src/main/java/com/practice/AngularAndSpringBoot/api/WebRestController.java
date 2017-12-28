package com.practice.AngularAndSpringBoot.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
	
	@RequestMapping("/api/hi")
	public String hi(){
		return "Hi I'm from SpringBoot";
	}
}
