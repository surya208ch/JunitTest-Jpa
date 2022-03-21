package com.example.junit.JunitTest.Repositry;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.junit.JunitTest.Entity.JunitEntity;

public interface JunitRepositry  extends JpaRepository<JunitEntity, Long> {

}
