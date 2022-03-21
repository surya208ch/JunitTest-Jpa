package com.example.junit.JunitTest.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class JunitEntity {
	
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private String address;
	private String sname;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "JunitEntity [id=" + id + ", name=" + name + ", address=" + address + ", sname=" + sname + "]";
	}
	
	

}
