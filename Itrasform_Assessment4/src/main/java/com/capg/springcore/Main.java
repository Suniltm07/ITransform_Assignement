package com.capg.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) 
	{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		
		CountryController controller = (CountryController) context.getBean("countryController");
		  Country country = controller.createNewCountry();
		  System.out.println("Country Name : " + country.getCountryName());
		  System.out.println("Country's Population : " + country.getPopulation());

	}

}
