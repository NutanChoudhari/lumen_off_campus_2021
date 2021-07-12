package com.training.service;
import java.util.*;

import com.training.entity.Book;
public class BookService {
	
	Map<String,List<Book>> bookList;

	public BookService() {
		super();
		bookList=new HashMap<>();
		init();
	}
	
	public void init() {
		List<Book> java=new ArrayList<>();
		java.add(new Book(101,"Head First  JAVA"));
		java.add(new Book(102,"Spring in Action"));
		
		List<Book> novel=new ArrayList<>()	;
		novel.add(new Book(201,"Harry potter"));
		novel.add(new Book(202,"War in Brazil"));
		
		bookList.put("java", java);
		bookList.put("novel", novel);
	}
	
	public List<Book> searchBook(String key){
		return this.bookList.get(key);
	}
}
