package com.example.junit.JunitTest.Entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity


public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	private String cname;
	private String caddress;
	private int pincode;
	private String state;
	
	
	
	
	public Customer() {
	}
	
	public Customer(int cid, String cname, String caddress, int pincode, String state) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.caddress = caddress;
		this.pincode = pincode;
		this.state = state;
	}
	
	@OneToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name="emp_name", nullable = false)
	public Employee employee;
	
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCaddress() {
		return caddress;
	}
	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", caddress=" + caddress + ", pincode=" + pincode
				+ ", state=" + state + "]";
	}
	
	
	
	

}
