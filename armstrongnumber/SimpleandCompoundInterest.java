package com.capg.armstrongnumber;

import java.util.Scanner;

public class SimpleandCompoundInterest 
{
	public static void main(String []args)
	{
	      double s, r, t, simpleinterest, compoundinterest;
	      
	      Scanner scanner = new Scanner (System. in);
	      
	      System.out.println("Enter the value of Principal = ");
	      s = scanner.nextDouble();
	      
	      System. out. println("Enter the Annual Rate of Interest :");
	      r = scanner.nextDouble();
	      
	      System. out. println("Enter the Time years:");
	      t = scanner.nextDouble();
	      
	      simpleinterest = (s * r * t)/100;
	      compoundinterest = s * Math.pow(1.0+r/100.0,t) - s;
	      
	      System.out.println("Simple Interest: "+simpleinterest);
	      System.out. println("Compound Interest: "+compoundinterest);
	      
	   }

}
