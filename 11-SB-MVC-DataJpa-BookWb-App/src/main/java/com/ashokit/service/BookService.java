package com.ashokit.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.ashokit.formBinding.Book;

public interface BookService {
	
	
	public boolean saveBook(Book book);
	
	public List<Book> GetAllBook();

}
