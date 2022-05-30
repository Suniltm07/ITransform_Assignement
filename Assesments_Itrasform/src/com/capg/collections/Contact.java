package com.capg.collections;

import java.util.Collections;
import java.util.TreeMap;

public class Contact 
{
	private long phoneNumber;
	private String name;
	private String email;
	private String gender;
	
	public Contact() {
		// TODO Auto-generated constructor stub
	}

	public Contact(long phoneNumber, String name, String email, String gender) {
		super();
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.email = email;
		this.gender = gender;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Contact [phoneNumber=" + phoneNumber + ", name=" + name + ", email=" + email + ", gender=" + gender
				+ "]";
	}
	

}
