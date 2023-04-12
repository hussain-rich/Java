package com.EIT.interfaces;

public class Person implements info {
	
	public String name;
	
	
	
	public Person(String name) {
		this.name = name;
	}

	public void greet() {
		
		System.out.println("hello There");
	}

	public void showinfo() {
		
		System.out.println("the person name is "+ name);
		
	}

}
