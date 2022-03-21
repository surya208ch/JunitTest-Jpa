package com.example.junit.JunitTest.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.junit.JunitTest.Entity.PanCard;
import com.example.junit.JunitTest.Entity.Person;
import com.example.junit.JunitTest.Repositry.PersonRepositry;

@SpringBootTest
public class PersonTest {
	
	@Autowired
	private PersonRepositry personRepositry;
	
	@Test
	public void savePerson() {
		
		
		PanCard pc = new PanCard();
		pc.setPNamer("chitti");
		pc.setPAddress("hiii");
		
		Person p = new Person();
		p.setName("chitti");
		p.setAdress("hiii");
		p.setPancard1(pc);
	
		
		personRepositry.save(p);
		
		
		
		
		
		
		
	}

}
