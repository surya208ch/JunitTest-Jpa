package com.example.junit.JunitTest.test;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.junit.JunitTest.Entity.Student;
import com.example.junit.JunitTest.Repositry.StudentRepositry;

@SpringBootTest
public class StudentTest {
	
	
	@Autowired
	private StudentRepositry sturep;
	
	/*@Test
	public void saveRepositry() {
		Student st = new Student();
		st.setName("srinu");
		st.setCollege("aitam");
	
		
		
		sturep.save(st);
	}*/

	@Test
	public void findByID() {
		
		long id = 4;
		
		Optional<Student> st = sturep.findById(id);
		
		
		
		
		System.out.println(st);
	}
	
	
	
	
}
