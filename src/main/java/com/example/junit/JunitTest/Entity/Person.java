package com.example.junit.JunitTest.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
	
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String adress;
	
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="panId")
	private PanCard pancard1;
	
	
}
