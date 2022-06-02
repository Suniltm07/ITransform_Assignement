package com.capg.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	public static void main(String[] args) 
	{

		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("config.xml");
		Employee emp=(Employee) context.getBean("myemployee");
		emp.getId();
		emp.getName();
		emp.getCompany();
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getCompany());
		
	}

}
