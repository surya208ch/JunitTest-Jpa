package com.example.junit.JunitTest.Entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class JunitTest2  implements Serializable{
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String street;
	private String city;
	private String zipcode;
	private String state;
	private String country;
	
	
	  @OneToOne(fetch = FetchType.LAZY, optional = false)
	    @JoinColumn(name = "user_id", nullable = false)
	    private JunitEntity junitEntity;
	
	
	
	public JunitTest2() {
	}
	public JunitTest2(long id, String street, String city, String zipcode, String state, String country) {
		super();
		this.id = id;
		this.street = street;
		this.city = city;
		this.zipcode = zipcode;
		this.state = state;
		this.country = country;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "JunitTest2 [id=" + id + ", street=" + street + ", city=" + city + ", zipcode=" + zipcode + ", state="
				+ state + ", country=" + country + "]";
	}
	
	
	
	
	

}
