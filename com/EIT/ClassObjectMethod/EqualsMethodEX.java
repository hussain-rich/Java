package com.EIT.ClassObjectMethod;

import java.util.Objects;

class Person{
	
	private int id;
	private String name;
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
	
	
}

public class EqualsMethodEX {

	public static void main(String[] args) {
		
		Person person1 =new Person(5,"venkat");
		Person person2 =new Person(5,"venkat");
		
		System.out.println(person1.equals(person2));
		
		Double dvalue1=7.2;
		Double dvalue2=7.2;
		
		System.out.println(dvalue1.equals(dvalue2));

		Integer no1=37;
		Integer no2=37;
		
		System.out.println(no1.equals(no2));
		

	}

}
