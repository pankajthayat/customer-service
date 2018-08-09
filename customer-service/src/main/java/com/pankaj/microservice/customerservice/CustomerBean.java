package com.pankaj.microservice.customerservice;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CustomerBean {
	
	@Id
	private int id;
	private String name;
	private String addressLine1;
	private String addressLine2;
	private int postCode;
	private int age;
	public CustomerBean() {
		// TODO Auto-generated constructor stub
	}
	public CustomerBean(int id, String name, String addressLine1, String addressLine2, int postCode, int age) {
		super();
		this.id = id;
		this.name = name;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.postCode = postCode;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddressLine1() {
		return addressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return addressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	

}
