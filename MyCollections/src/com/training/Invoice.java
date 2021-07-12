package com.training;

public class Invoice {
	private int invoiceNumber;              //Format of var name is camelCasing
	private double quantity;
	private double ratePerUnit;
	
	public Invoice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getInvoiceNumber() {
		return invoiceNumber;
	}
	@Override
	public String toString() {
		return "Invoice [invoiceNumber=" + invoiceNumber + ", quantity=" + quantity + ", ratePerUnit=" + ratePerUnit
				+ "]";
	}
	public void setInvoiceNumber(int invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public double getQuantity() {
		return quantity;
	}
	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}
	public double getRatePerUnit() {
		return ratePerUnit;
	}
	public void setRatePerUnit(double ratePerUnit) {
		if(ratePerUnit>0) {
			this.ratePerUnit = ratePerUnit;
		}
		else {
			throw new RuntimeException("Wrong value for ratePerUnit");
		}
			
	}
	public double calculate() {
		double amount=(this.ratePerUnit-discount())*this.quantity;
		return amount;
	}
	private double discount() {
		double discount=100;
		if(this.ratePerUnit>=10000) {
			discount=150;
		}
		return discount;
	}

}
