package com.training.utils;

import java.sql.Connection;
import java.util.List;

import com.training.dao.CustomerRepositoryImpl;
import com.training.model.Customer;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(DbConnection.getOracleConnection());
		Connection con=DbConnection.getOracleConnection();
		CustomerRepositoryImpl dao=new CustomerRepositoryImpl(con);
		int ch=3;
		try {
			if(ch==1) {
				dao.add(new Customer(2,"rajesh","rajesh@abc.com"));
				dao.add(new Customer(4,"Ramesh","ramesh@abc.com"));
			}
			if(ch==2) {
				List<Customer> list=dao.findAll();
				for(Customer eachCustomer: list) {
					System.out.println(eachCustomer);
				}
			}
			if(ch==3) {
				Customer cust=dao.findById(2);
				System.out.println(cust);
				
			}
			if(ch==4) {
				boolean result=dao.remove(4);
				if(result==true) {
					System.out.println("Customer deleted!");
				}
				else 
					System.out.println("Customer doesn't exist!");
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
