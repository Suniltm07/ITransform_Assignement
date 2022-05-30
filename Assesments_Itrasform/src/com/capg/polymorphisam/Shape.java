package com.capg.polymorphisam;

public abstract class Shape 
{
	public abstract void draw();

}
	class Line extends Shape
	{
		@Override
		public void draw() 
		{
			System.out.println("This is the Line drawing the line");			
		}
		
	}
	class Rectange extends Shape
	{
		@Override
		public void draw() 
		{
			System.out.println("This is the Rectangle drawing the Rectangle");			
		}		
	}
	class Cube extends Shape
	{
		@Override
		public void draw() 
		{
			System.out.println("This is the Cube grawing the Cube");			
		}
    }
