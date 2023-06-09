package com.gl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloContr {
	
	
	//adding request mapping-->URL
	@RequestMapping("/hello")
	public String giveHelloMessage() {
		return "hello";
	}

}
