package com.example.junit.JunitTest.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.junit.JunitTest.Entity.Employee;
import com.example.junit.JunitTest.Repositry.EmpRepositry;

@SpringBootTest
public class EmployeeTest {
	 @Autowired
	 private EmpRepositry empRepositry;
	 
	 @Test
	 public void saveRepositry() {
		 
		 Employee em = new Employee();
		 em.setEage(17);
		 em.setEname("Mohit");
		 em.setSal(100000);
		 
		 empRepositry.save(em);
		 
		 
	 }
	 
	 
	 

}
