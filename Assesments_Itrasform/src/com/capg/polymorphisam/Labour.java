package com.capg.polymorphisam;

public class Labour extends Employee
{
	double overTime = 0;
	public double calculateSalary(double salary, double overTime) 
	{
	double lbSalary = salary + overTime;
	System.out.println("Labour Salary = "+lbSalary);
	return lbSalary ;

    }
}
