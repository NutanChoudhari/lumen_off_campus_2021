package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Tour;
import com.example.demo.repo.TourRepository;


@Service
public class TourService {

	@Autowired
	private TourRepository repo;
	
	
	
	public Tour addTour(Tour entity) {
		
		 return this.repo.save(entity);
	}
	
	
	public List<Tour> findAll(){
		
		return this.repo.findAll();
	}

	
	
}