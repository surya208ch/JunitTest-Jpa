package com.example.junit.JunitTest.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.junit.JunitTest.Entity.PanCard;
import com.example.junit.JunitTest.Repositry.PanCardRepositry;

@SpringBootTest
public class PanCardTest {
	
	@Autowired
	private PanCardRepositry panCardRepositry;
	
	@Test
	public void savePanCard() {
		
		PanCard pc = new  PanCard();
		
		pc.setPNamer("Surya");
		pc.setPAddress("Tuni");
		
		panCardRepositry.save(pc);
		
		
	}
	
	
}
