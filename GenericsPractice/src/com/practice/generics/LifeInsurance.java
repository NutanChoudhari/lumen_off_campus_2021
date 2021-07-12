package com.practice.generics;

public class LifeInsurance extends Insurance{

	private int age;

	protected LifeInsurance(String policyHolderName, double poliyAmount,int age) {
		super(policyHolderName, poliyAmount);
		this.age=age;
		// TODO Auto-generated constructor stub
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public double calculatePremium() {
		double premium=2500;
		// TODO Auto-generated method stub
		if(age>25) {
			premium=2000;
		}
		return premium;
	}
	
}
