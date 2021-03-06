package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.model.Customer;

public class CustomerService {

	private List<Customer> custList;
	
	public CustomerService() {
		super();
		custList=new ArrayList<Customer>();
		init();
	}
	
	private void init() {
		this.custList.add(new Customer(101,"Suresh",2884));
		this.custList.add(new Customer(102,"Sumesh",3775));
	}
	
	public boolean add(Customer cust) {
		return this.custList.add(cust);
	}
	
	public Customer getCustomerById(int id) {
		Customer cust=null;
		Optional<Customer> resp= this.custList.stream().filter(c->c.getCustomerId()==id).findFirst();
		if(resp.isPresent()) {
			cust=resp.get();
		}else {
			throw new RuntimeException("Element not found");
		}
		return cust;
	}
	
	public void	deleteById(int id) {
		
		Optional<Customer> resp= this.custList.stream().filter(c->c.getCustomerId()==id).findFirst();
		
		this.custList.remove(resp);
		
	}
	
	public List<Customer> getAllCustomer(){
		
		return this.custList;
	}
}
