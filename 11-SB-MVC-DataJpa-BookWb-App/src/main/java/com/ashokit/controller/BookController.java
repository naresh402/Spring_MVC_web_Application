package com.ashokit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ashokit.formBinding.Book;
import com.ashokit.service.BookServiceImpl;

@Controller
public class BookController {
	
	@Autowired
	BookServiceImpl service;
	
	@GetMapping(value={"/", "/saveBook"})
	public String loadBookForm(Model model) {
		Book b=new Book();
		model.addAttribute("book", b);
		return "addBook";
	}
    
	
	@PostMapping("/addBook")
	public String handleSubmitBtn(@ModelAttribute("book") Book book, Model model) {
		boolean isSaved=service.saveBook(book);
		
		String msg="";
		if(isSaved) {
			msg="Book Added Succesfully";
		}else {
		
		return "Failed to added";
	}
		model.addAttribute("msg", msg);
		return "addBook";
		
	}
	
	@GetMapping("/viewBooks")
	public String viewAllBook(Model model) {
		List<Book> book =service.GetAllBook();
		model.addAttribute("books", book);
		return "viewBook";
		
		
		
	}
}
