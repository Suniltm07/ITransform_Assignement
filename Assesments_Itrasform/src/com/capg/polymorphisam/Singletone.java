package com.capg.polymorphisam;

public class Singletone
{
	
	 
	  private static Singletone obj = new Singletone();
	  public String string;

	 
	  private Singletone()
	  {
	    string = "Welcome to Capgemini";
	  }

	 
	  public static Singletone getInstance()
	  {
	    return obj;
	  }

	  public static void main(String args[])
	  {
		  Singletone text = Singletone.getInstance();
	    
	    System.out.println("Original String:.....");
	    System.out.println(text.string);

	   
	    System.out.println("String in Upper Case:...");
	    text.string = (text.string).toUpperCase();
	    System.out.println(text.string);
	  }
	}


