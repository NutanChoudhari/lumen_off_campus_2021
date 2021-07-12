package com.practice.generics;

import java.util.*;

public class Application {
	
	public static void main(String[] args) {
		
		List<Insurance> lifeList=new ArrayList<>();
		lifeList.add(new LifeInsurance("Ramesh", 80000, 33));
		lifeList.add(new LifeInsurance("Mahesh", 77000, 24));
//		List<LifeInsurance> lifeList=Arrays.asList(new LifeInsurance("Ramesh", 80000, 33),
//				new LifeInsurance("Mahesh", 77000, 24));
//		
		List<VehicleInsurance> vehicleList=Arrays.asList(new VehicleInsurance("Naveen", 80000, "Car"),
				new VehicleInsurance("Bala", 50000, "TWoWhellEr"));

		InsuranceService service=new InsuranceService();
		service.printPremium(lifeList);
		//service.printPremium(vehicleList);
	}

	
	
}