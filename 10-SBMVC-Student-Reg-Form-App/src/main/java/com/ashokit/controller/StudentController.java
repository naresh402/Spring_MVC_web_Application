package com.ashokit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.domain.Student;

@Controller
public class StudentController {
	
	@GetMapping("/register")
	public String loadStudentForm(Model model) {
		Student s=new Student();
		model.addAttribute("student",s);
		return "studentReg";
	}
   
	@PostMapping("/registers")
	public String handleSubmitBtn(@ModelAttribute("student")Student s,Model model) {
		System.out.println(s);
	//	model.addAttribute("succMsg", "Registration Completed");
		return "regSuccess";
	}
}
