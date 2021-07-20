package com.training;
import java.util.Scanner;
public class Application {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		Greeting javagreet=new Greeting();
		System.out.println(javagreet.getGreeting());
		
		System.out.println(javagreet.getGreeting("Nutan"));
		
		System.out.println(javagreet.getGreeting(args[1]));
		System.out.println(javagreet.getGreeting(args[2]));
//		System.out.println("Enter Name:")
//		String userName=sc.nextLine();
//		System.out.println(javagreet.getGreeting(userName));
	}
	
	
}
