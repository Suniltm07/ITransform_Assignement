package com.capg.springcore;


public class Country 
{
	String countryName;
	long population;
	
	public Country() {
		
	}
	public Country(String countryName, long population) {
		super();
		this.countryName = countryName;
		this.population = population;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return "Country [countryName=" + countryName + ", population=" + population + "]";
	}
	
}
