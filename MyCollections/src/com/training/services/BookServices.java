package com.training.services;

import java.util.List;

import com.training.Book;
import com.training.ifaces.crudRepository;

public class BookServices implements crudRepository<Book> {

	@Override
	public boolean save(Book inv) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
