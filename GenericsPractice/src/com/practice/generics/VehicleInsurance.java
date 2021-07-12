package com.practice.generics;

public class VehicleInsurance extends Insurance {
	private String vehicleModel;

	protected VehicleInsurance(String policyHolderName, double poliyAmount, String vehicleModel) {
		super(policyHolderName, poliyAmount);
		this.vehicleModel = vehicleModel;
	}

	public String getVehicleModel() {
		return vehicleModel;
	}

	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}

	@Override
	public double calculatePremium() {
		double premium=1500;
		// TODO Auto-generated method stub
		if(vehicleModel.equalsIgnoreCase("twoWheller")) {
			premium=600;
		}
	
		return premium;
	}
	
}
