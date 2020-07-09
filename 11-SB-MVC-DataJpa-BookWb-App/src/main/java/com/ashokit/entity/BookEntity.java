package com.ashokit.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="BOOK_TBL")
@Data
public class BookEntity {
	
	@Id
	@GeneratedValue
	@Column(name="BOOK_ID")
	private Integer bookId;
	
	@Column(name="NAME")
	private String bookName;
	
	@Column(name="BOOK_AUTHOR")
	private String bookAuthor;
	
	@Column(name="BOOK_PRICE")
	private String bookPrice;

}
