package com.capg.polymorphisam;

public class MainEmployee 
{
	public static void main(String[] args) 
	{
		Manager mn = new Manager();
		mn.calculateSalary(20000.0,15000.0);
		
		Labour lb = new Labour();
	    lb.calculateSalary(15000.0, 5000.0);
	}

}
