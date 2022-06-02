package com.capg.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args) throws Exception 
	{
		ClassPathXmlApplicationContext context = new 
				            ClassPathXmlApplicationContext("config.xml");
		Person person=(Person) context.getBean("obj", Person.class);
		
		System.out.println(person.getName());
		 
		context.close();

		

		
	}
	
}
