package com.capg.abstractexample;

abstract class test
{
	  public abstract void demo();
}


class sample extends test
{
	@Override
	public void demo()
	{
		System.out.println("hello");
	}

}
public class CheckingAbstract{
	public static void main(String[] args) {
		sample sam=new sample();
		sam.demo();
		
	}
	
}
