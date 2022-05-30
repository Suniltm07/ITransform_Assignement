package com.capg.collections;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class ContactMain 
{
	public static void main(String[] args) {
		TreeMap<Long, Contact> tree = new TreeMap<>();
		Contact s1 = new Contact(123,"Sunil","suni@gmail.com","male");
		Contact s2 = new Contact(124,"kiran","kiran@gmail.com","male");
		Contact s3 = new Contact(125,"Ramya","ramya@gmail.com","female");
		Contact s4 = new Contact(122,"chaithra","chai@gmail.com","female");
		
		tree.put((long) 123, s1);
		tree.put((long) 124,s2);
		tree.put((long) 125,s3);
		tree.put((long) 122,s4);
		
		Set keys = tree.keySet();
		System.out.println(keys);
		
		Collection<Contact> values = tree.values();
		System.out.println(values);
		
		Set<Map.Entry<Long, Contact>> entries = tree.entrySet();
		System.out.println(entries);
		
	}

}
