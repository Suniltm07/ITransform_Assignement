package com.capg.Strings;

public class Program2 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("StringBuffer");
		sb.append("is a peer class of string");
		sb.append("that provides much of ");
		sb.append("the functionality of string");
		System.out.println(sb);
		
		System.out.println("==================================");
		
		StringBuffer sb1 = new StringBuffer("it is used to at the specified index position");
		sb1.replace(14, 15, "insert into");
		System.out.println(sb1);
		
		System.out.println("=================================");
		
		StringBuffer sb2 = new StringBuffer("this method returns the reversed object on which it was called");
		sb2.reverse();
		System.out.println(sb2);
		

	}

}
