package com.example.junit.JunitTest.Repositry;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.junit.JunitTest.Entity.Laptop;

public interface LaptopRepositry  extends JpaRepository<Laptop, Long>{
	
	List<Laptop> findByNameIn(List<String> list);
	
	List<Laptop> findByPriceIn(List<BigDecimal> list);

}
