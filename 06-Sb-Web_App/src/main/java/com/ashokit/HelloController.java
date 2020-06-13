package com.ashokit;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
    
	@RequestMapping("/hello")
	public String HelloGoodMorning(Model model) {
		
		model.addAttribute("welcome", "Hello Guys How Are You All");
		
		return "homepage";
		
		
		
		
	}
}
