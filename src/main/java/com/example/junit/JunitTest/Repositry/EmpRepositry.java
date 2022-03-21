package com.example.junit.JunitTest.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.junit.JunitTest.Entity.Employee;

public interface EmpRepositry extends JpaRepository<Employee, Long> {

}
