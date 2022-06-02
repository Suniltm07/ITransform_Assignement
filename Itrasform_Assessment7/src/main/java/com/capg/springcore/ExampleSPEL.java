package com.capg.springcore;
import org.springframework.expression.Expression;  
import org.springframework.expression.ExpressionParser;  
import org.springframework.expression.spel.standard.SpelExpressionParser;  

public class ExampleSPEL 
{
	public static void main(String[] args) 
	{  
		ExpressionParser parser = new SpelExpressionParser();  
		  
		/*Expression exp = parser.parseExpression("'Hello'");  //Display Hello
		String message = (String) exp.getValue();  
		System.out.println(message);  
		
		
		ExpressionParser parser = new SpelExpressionParser();  //Using concat() method with String
		Expression exp = parser.parseExpression("'I AM'.concat(' Sunil')");  
		String message = (String) exp.getValue();  
		System.out.println(message); 
		
		Expression exp = parser.parseExpression("'Hello World'.bytes");   //Converting String into byte array
		byte[] bytes = (byte[]) exp.getValue();  
		for(int i=0;i<bytes.length;i++)
		{  
		    System.out.print(bytes[i]+" ");  
	    }
		
		Expression exp = parser.parseExpression("'Hello World'.bytes.length");  //Getting length after converting string into bytes
		int length = (Integer) exp.getValue();  
		System.out.println(length);  */
		
		Expression exp = parser.parseExpression("new String('hello world').toUpperCase()");  //Converting String contents into uppercase letter
		String message = exp.getValue(String.class);  
		System.out.println(message);  
		
		
	}

}
