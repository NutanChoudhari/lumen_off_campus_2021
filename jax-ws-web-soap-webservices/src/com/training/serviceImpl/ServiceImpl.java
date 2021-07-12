package com.training.serviceImpl;

import java.util.HashMap;
import java.util.Map;

import javax.jws.WebService;

import com.training.ifaces.WeatherService;

@WebService
public class ServiceImpl implements WeatherService{
	
	@Override
	public String getWeather(String city) {
		// TODO Auto-generated method stub
		Map<String,String> defaValue=new HashMap<String,String>();
		
		defaValue.put("sunrise", "6.00am");
		defaValue.put("sunset", "6.20am");
		defaValue.put("max-temp", "36C");
		defaValue.put("sumin-temp", "22C");
		
		if(city.equals("chennai")) {
			defaValue.put("sunrise", "5.30am");
			defaValue.put("sunset", "6.10am");
			defaValue.put("max-temp", "39C");
			defaValue.put("sumin-temp", "27C");
		}
		
		return defaValue.toString();
	}
}
