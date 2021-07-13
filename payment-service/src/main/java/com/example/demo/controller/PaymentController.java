package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Payment;
import com.example.demo.service.PaymentService;

@RestController
public class PaymentController {

	@Autowired
	private PaymentService service;
	
	@GetMapping(path="/payments")
	public List<Payment> getAll(){
		return this.service.getAll();
	}
	
	@GetMapping(path="/payments/{id}")
	public Payment getById(@PathVariable("id") int id ){
		return this.service.getById(id);
	}
	
	@PostMapping(path="/payments")
	public ResponseEntity<Payment> add(@RequestBody Payment entity) {
		return ResponseEntity.status(HttpStatus.CREATED).body(this.service.add(entity));
	}
	
	@PutMapping(path="/payments")
	public Payment update(@RequestBody Payment entity) {
		return this.service.add(entity);
	}
	
	@DeleteMapping(path="/payments")
	public Payment remove(@RequestBody Payment entity) {
		return this.service.remove(entity);
	}
}
