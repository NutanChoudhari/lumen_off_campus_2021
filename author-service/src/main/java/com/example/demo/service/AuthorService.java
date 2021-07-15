package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Author;
import com.example.demo.repo.AuthorRepository;

@Service
public class AuthorService {

	@Autowired
	AuthorRepository repo;
	
	
	public List<Author> getAll(){
		return this.repo.findAll();	
	}
	
	public Author add(Author entity) {
		return this.repo.save(entity);
	}
	
	public List<Author> getByFirstName(String firstName) {
		return this.repo.findByFirstName(firstName);
		
	}
	
	public List<Author> getByCity(String city) {
		return this.repo.findByCity(city);
		
	}
}
