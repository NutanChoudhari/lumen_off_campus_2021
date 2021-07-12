package com.training;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServiceImplService service=new ServiceImplService();
		ServiceImpl proxy=service.getServiceImplPort()	;
		System.out.println(proxy.getWeather("pune"));
	}

}

