package com.practice.generics;

import java.util.List;

public class InsuranceService {

//	public void printPremium(List<? extends Insurance> list) {
//		for(Insurance eachPolicy:list) {
//			System.out.println(eachPolicy.calculatePremium());
//		}
//	}
//	
	public void printPremium(List<? super LifeInsurance> list) {
		System.out.println(list.add(new LifeInsurance("Ramesh", 1000000, 23)));
		for(Object eachPolicy:list) {
			System.out.println(((LifeInsurance) eachPolicy).calculatePremium());
		}
	}
	
	
}
