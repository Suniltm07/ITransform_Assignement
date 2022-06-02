package com.capg.springcore;

import org.springframework.stereotype.Repository;

@Repository("countryRepo")
public class CountryRepository 
{
	public Country createNewCountry() {
		  // You should get it from database
		  Country country = new Country("India", 131000000);
		  return country;
		}

}
