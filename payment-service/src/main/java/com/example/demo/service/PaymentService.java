package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Payment;
import com.example.demo.repos.PaymentRepository;

@Service
public class PaymentService {

	@Autowired
	private PaymentRepository repo;
	
	public List<Payment> getAll(){
		return this.repo.findAll();
	}
	
	public Payment add(Payment entity) {
		return this.repo.save(entity);
	}
	
	public Payment update(Payment entity) {
		return this.repo.save(entity);
	}
	
	public Payment remove(Payment entity) {
		Optional<Payment> obj=this.repo.findById(entity.getTxnId());
		if(obj.isPresent()) {
			this.repo.delete(entity);
		}else
		{
			throw new NoSuchElementException("Element Not Found");
		}
		
		return entity;
	}
	
	public Payment getById(int id) {
		return this.repo.findById(id).orElseThrow(() -> new NoSuchElementException("Element with that Id is not available"));
	}
	
	public List<Payment> getByDescription(String srchString){
		return this.repo.findByDescriptionEquals(srchString);
	}
	
	public List<Payment> getByAmountGreaterThan(double amount){
		return this.repo.findByAmountGreaterThan(amount);
	}
	
	public ResponseEntity<String> updateAmount(int txnId,double amount){
		int rowsUpdated=this.repo.updateAmount(amount,txnId);
		return ResponseEntity.ok().body(rowsUpdated+" Rows Updated!");
	}
	
	
}
