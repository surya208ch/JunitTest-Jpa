package com.example.junit.JunitTest.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.junit.JunitTest.Entity.Person;

public interface PersonRepositry extends JpaRepository<Person, Long>{

}
