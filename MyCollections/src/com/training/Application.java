package com.training;


import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

import com.training.services.InvoiceService;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice tv=new Invoice();
		tv.setInvoiceNumber(101);
		tv.setQuantity(9);
		tv.setRatePerUnit(20000.00);
		System.out.println();
		
		Invoice fridge=new Invoice();
		fridge.setInvoiceNumber(102);
		fridge.setQuantity(1);
		fridge.setRatePerUnit(12000.00);
//		InvoiceService ser=new InvoiceService();
//		ser.save(tv);
//		ser.save(fridge);
//		List<Invoice> list=ser.findAll();
//		for(Invoice eachElement:list) {
//			System.out.println(eachElement);
//		}

		HashSet<Invoice> set=new HashSet<>();
		System.out.println(set.add(fridge));
		System.out.println(set.add(tv));
		System.out.println(set.add(fridge));
		System.out.println(set);
		System.out.println(set.size());
		
}
	}
