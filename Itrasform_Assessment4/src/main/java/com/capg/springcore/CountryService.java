package com.capg.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("countryService")
public class CountryService 
{
	 @Autowired
	 CountryRepository countryRepo;
	 public Country createNewCountry() {
	  
	   return countryRepo.createNewCountry();
	 }
	
}
