package com.example.junit.JunitTest.test;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.junit.JunitTest.Entity.JunitEntity;
import com.example.junit.JunitTest.Repositry.JunitRepositry;

@SpringBootTest
public class RealTestCase {
	
	@Autowired
	private JunitRepositry junitRepositry;
	
	
	@Test
	public void saveRepositry() {
		
		JunitEntity je = new JunitEntity();
		je.setName("Raj");
		je.setAddress("Tuni");
		je.setSname("mms ");
		
		junitRepositry.save(je);
		
	}
	
	@Test
	public void findByIdRepositry() {
		
		
		long id=1;
	Optional<JunitEntity>	unit = junitRepositry.findById(id);
		System.out.println(unit);
	}
	
	

}
