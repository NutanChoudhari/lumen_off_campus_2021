package com.training;



public class Greeting {

	public String getGreeting() {
		//return "Welcome to Java Programming!";  //will create String always
		return new String("Welcome to java!");    //Check if string is present in string pool if there point to it
	}
	//add one more method Greeting which take userName as argument
	public String getGreeting(String name) {
		return new String(name);
	}
}
