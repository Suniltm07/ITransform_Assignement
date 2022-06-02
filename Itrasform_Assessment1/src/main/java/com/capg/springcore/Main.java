package com.capg.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main 
{
	
	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext("beans.xml");
		Customer customer=(Customer) context.getBean("obj");
		customer.getAddress();
		customer.getCustomerId();
		customer.getCustomerName();
		customer.getCustomerContact();		
		System.out.println(customer.getAddress());
		System.out.println(customer.getCustomerId());
		System.out.println(customer.getCustomerName());
		System.out.println(customer.getCustomerContact());
	
		
	
	}

}
