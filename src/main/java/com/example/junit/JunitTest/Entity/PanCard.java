package com.example.junit.JunitTest.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PanCard {
	
	@Id
	@GeneratedValue
	private Long panId;
	private String pNamer;
	private String pAddress;
	
	@OneToOne
	private Person person1;
	
}
