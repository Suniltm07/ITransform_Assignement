package com.capg.collections;

import java.util.HashSet;

public class UniqueProductsObjects 
{
	public static void main(String args[]) {
	     
	      HashSet<String> capg = new HashSet<String>();

	      
	      capg .add("Sunil");
	      capg .add("Virat");
	      capg .add("Dhoni");
	      capg .add("Rohith");
	      capg .add("Raina");
	     
	      capg .add("Raina");
	      capg .add("Rohith");
	     
	      capg .add(null);
	      capg .add(null);

	      
	      System.out.println(capg);
	    }

}
