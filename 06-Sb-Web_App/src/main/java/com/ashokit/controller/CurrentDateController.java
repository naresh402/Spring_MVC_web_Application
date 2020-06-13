package com.ashokit.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CurrentDateController {
	@RequestMapping("/date")
	public ModelAndView displayGoodMorning() {

		ModelAndView mv = new ModelAndView();

		String text = "Good Morning And Wellcome to AshokIT:" + new Date();

		mv.addObject("msg", text);
		mv.setViewName("index");
		return mv;

	}

}
