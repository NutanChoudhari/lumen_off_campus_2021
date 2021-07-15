package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Author;
import com.example.demo.service.AuthorService;

@RestController
public class AuthorController {

	@Autowired
	private AuthorService service;
	
	@GetMapping(path="/authors")
	public List<Author> getAll(){
		return this.service.getAll();
	}
	
	@PostMapping(path="/authors")
	public ResponseEntity<Author> add(@RequestBody Author entity) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.add(entity));
	}
	
	@GetMapping(path="/authors/srch/fname/{firstname}")
	public List<Author> getByFirstName(@PathVariable("firstname") String firstName){
		return this.service.getByFirstName(firstName);
	}
	
	@GetMapping(path="/authors/srch/city/{city}")
	public List<Author> getByCity(@PathVariable("city") String city){
		return this.service.getByCity(city);
	}
}
