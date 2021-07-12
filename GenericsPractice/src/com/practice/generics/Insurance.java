package com.practice.generics;

public class Insurance {

	private String policyHolderName;
	private double policyAmount;
	
	public double calculatePremium() {
		return 1200;
	}

	protected Insurance(String policyHolderName, double poliyAmount) {
		this.policyHolderName = policyHolderName;
		this.policyAmount = poliyAmount;
	}

	public String getPolicyHolderName() {
		return policyHolderName;
	}

	public void setPolicyHolderName(String policyHolderName) {
		this.policyHolderName = policyHolderName;
	}

	public double getPoliyAmount() {
		return policyAmount;
	}

	public void setPoliyAmount(double poliyAmount) {
		this.policyAmount = poliyAmount;
	}
	
}
