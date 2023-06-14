package com.glearning.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {
	
	@RequestMapping("/greet")
	public String giveWelComeMessage(ModelMap model) {
		model.addAttribute("message","Spring MVC thymeleaf HelloWorld");
		
		return "welcome";
	}

}
