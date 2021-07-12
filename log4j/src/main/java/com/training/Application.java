package com.training;

import java.util.Scanner;

import org.apache.log4j.Logger;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log=Logger.getRootLogger();
		log.info("log4j Configured correctly");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number=sc.nextInt();
		if(number<100) {
			log.error("Invalid Number");
			throw new RuntimeException("Exception");
		}
		else {
			log.debug("You entered correct number");
		}
		sc.close();
	}

}
