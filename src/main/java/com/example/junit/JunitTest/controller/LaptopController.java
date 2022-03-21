package com.example.junit.JunitTest.controller;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.junit.JunitTest.Entity.Laptop;
import com.example.junit.JunitTest.Repositry.LaptopRepositry;

@RestController
public class LaptopController {
	
	@Autowired
	LaptopRepositry lapRepo;

	@GetMapping("/laptop/names")
	public ResponseEntity<List<Laptop>> getLaptopByNames(){
		return new ResponseEntity<>(lapRepo.findByNameIn(Arrays.asList("Hp","Lenovo")), HttpStatus.OK);
	}
	
	@GetMapping("/laptop/prices")
	public ResponseEntity<List<Laptop>> getLaptopByPrices(){
		return new ResponseEntity<>(lapRepo.findByPriceIn(Arrays.asList(new BigDecimal(50000.00),new BigDecimal(100000.00))), HttpStatus.OK);
	}
	
}
