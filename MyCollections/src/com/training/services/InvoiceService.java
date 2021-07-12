package com.training.services;

import java.util.ArrayList;
import java.util.List;

import com.training.Invoice;
import com.training.ifaces.crudRepository;

public class InvoiceService implements crudRepository<Invoice>{

	private List<Invoice> invoiceList;
	@Override
	public boolean save(Invoice inv) {
		// TODO Auto-generated method stub
		
		return this.invoiceList.add(inv);
	}

	public InvoiceService() {
		
		super();
		this.invoiceList=new ArrayList();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Invoice> findAll() {
		// TODO Auto-generated method stub
		return this.invoiceList;
	}

}
