package com.capg.springcore;

public class Person 
{
	 private String name;
	 
	    Person() {
	        System.out.println("Constructor of person bean is invoked!");
	    }

		public Person(String name) {
			super();
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "Person [name=" + name + "]";
		}
		//Bean initialization code
	    public void init() throws Exception {
	        System.out.println("Initializing method of person bean is invoked!");
	    }
	 
	    //Bean destruction code
	    public void destroy() throws Exception {
	        System.out.println("Destroy method of person bean is invoked!");
	    }

}
