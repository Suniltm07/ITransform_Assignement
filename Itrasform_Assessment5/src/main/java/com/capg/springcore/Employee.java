package com.capg.springcore;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Required;

public class Employee 
{
	 private String id;
	    private String name;
	 
	    @Resource(name="mycompany")
	    private Company company;
	    
	    public Employee() {
			// TODO Auto-generated constructor stub
		}

		public Employee(String id, String name, Company company) {
			super();
			this.id = id;
			this.name = name;
			this.company = company;
		}

		public String getId() {
			return id;
		}
		@Required
		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}
		@Required
		public void setName(String name) {
			this.name = name;
		}

		public Company getCompany() {
			return company;
		}
		@Required
		public void setCompany(Company company) {
			this.company = company;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", company=" + company + "]";
		}	    

}
