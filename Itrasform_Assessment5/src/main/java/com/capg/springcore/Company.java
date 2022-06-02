package com.capg.springcore;

import org.springframework.beans.factory.annotation.Required;

public class Company 
{
	private String name;
    private String location;
    
    public Company() {
		// TODO Auto-generated constructor stub
	}
    
	public Company(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	public String getName() {
		return name;
	}
    
	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}
	@Required
	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", location=" + location + "]";
	}
	
}
