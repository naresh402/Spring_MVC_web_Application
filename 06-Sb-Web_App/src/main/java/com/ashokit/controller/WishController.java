package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WishController {
	
	@RequestMapping("/wish")
	public String wishMessage(Model model) {
		
		model.addAttribute("wish", "Wish You All The Best...!!!");
		return"wishMessage";
		
	}

}
