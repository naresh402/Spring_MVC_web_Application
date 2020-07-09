package com.ashokit.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ashokit.entity.BookEntity;
import com.ashokit.formBinding.Book;
import com.ashokit.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;

	@Override
	public boolean saveBook(Book book) {
		BookEntity entity=new BookEntity();
		BeanUtils.copyProperties(book, entity);
		BookEntity	saveEntity=bookRepository.save(entity);
		
			return saveEntity.getBookId()!=null;
		}
		

	@Override
	public List<Book> GetAllBook() {
		List<Book> book=new ArrayList<Book>();
		List<BookEntity> listEntity=bookRepository.findAll();
		for(BookEntity e:listEntity) {
			Book b=new Book();
			b.setBookId(e.getBookId());
			b.setBookName(e.getBookName());
			b.setBookAuthor(e.getBookAuthor());
			b.setBookPrice(e.getBookPrice());
			book.add(b);
		
		}
		return book;
	}
	
}
