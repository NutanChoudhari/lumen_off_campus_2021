package com.training.tests;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

import com.training.StudentService;

public class TestStudentService {
	
	StudentService service;
	@BeforeEach
	public void setUp() {
		service=new StudentService();
	}
	@Test
	public void testForNotNull() {
		
		String actual=service.assignGrade(90);
		assertNotNull(actual);
	}
	
	@Test
	public void testForGradeO() {
		String actual=service.assignGrade(85);
		assertEquals("O", actual);
	}
}
