package com.capg.armstrongnumber;

import java.util.Scanner;

public class IncomeTax 
{
	public static void main(String args[])
	{
	double t=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter income ");
	double i=sc.nextDouble();
	t=incomeTax(i);
	System.out.println("Income tax amount is "+t);
	}
    static double incomeTax(double i)
     {
	double tax=0;	
	if(i>=0 && i<=180000) {
		tax=0;
	}
	else if(i>=181001 && i<=300000) {
		tax=0.1*(i-181001);
	}
	else if(i>=300001 && i<=500000) {
		tax=(0.2*(i-300001))+10000;
	}
	else if(i>=5000001 && i<=10000000) {
		tax=(0.3*(i-5000001))+50000;
	}
	else {		
	return tax; 
	}
	return tax;
}
	

}
