package com.example.demo.service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
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
}
