package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Author;

@Repository
public interface AuthorRepository extends JpaRepository<Author,Long>{

	public List<Author> findByFirstName(String firstName);
	
	public List<Author> findByCity(String city);

}
