package com.example.junit.JunitTest.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.junit.JunitTest.Entity.PanCard;

public interface PanCardRepositry extends JpaRepository<PanCard, Long>{

	
}
