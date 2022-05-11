package com.capg.employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.List;


class Employee implements Comparable<Employee>
{
    private String name;
    private double salary;
    private int age;
    private String joiningDate;
 
    public Employee(String name,double salary, int age,String joiningDate)
    {
        this.name = name;
        this.salary=salary;
        this.age = age;
        this.joiningDate=joiningDate;
    }
 

    public String getName() {
        return name;
    }
    public double getSalary() {
    	return salary;
    	
    }
 
    public int getAge() {
        return age;
    }
    public String getJoiningDate() {
    	return joiningDate;
    }
    
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", age=" + age + ", joiningDate=" + joiningDate + "]";
	}

	@Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }

    public static void main(String[] args)
    {
        List<Employee> emp = new ArrayList<>(Arrays.asList(new Employee("Sunil",15000, 23,"09-JAN-2015"),
                                                           new Employee("Dhoni",20000, 40,"07-JUL-1989"),
                                                           new Employee("Virat",25000, 34,"15-FEB-1995"),
                                                           new Employee("Rohit",30000,35,"23-DEC-1999"),
                                                           new Employee("Arun",10000,20,"12-Aug-2022")));         
 
        Collections.sort(emp);
        System.out.println(emp);
    }

}
