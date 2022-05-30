package com.capg.polymorphisam;

public class Manager extends Employee 
{
	double incentive = 0;
	public double calculateSalary(double salary, double incentive) 
	{
	double mnSalary = salary + incentive;
	System.out.println("Manager Salary = "+mnSalary);
	return mnSalary ;
	}

}
