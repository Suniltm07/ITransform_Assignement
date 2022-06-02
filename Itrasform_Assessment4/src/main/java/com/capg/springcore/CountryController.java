package com.capg.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller ("countryController")
public class CountryController 
{
	@Autowired
    CountryService countryService;
 
    public Country createNewCountry()
    {
        return countryService.createNewCountry();
    }

}
