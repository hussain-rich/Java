package com.EIT.collections;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person{
	
	private int id;
	private String name;
	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
public class CustomObjectEX {

	public static void main(String[] args) {
		Person p1=new Person(1,"bob");
		Person p2=new Person(1,"sue");
		Person p3=new Person(1,"mike");
		Person p4=new Person(1,"sue");
		
		Map<Integer,Person> hs2=new HashMap<Integer,Person>();
		
		hs2.put(1,p1);
		hs2.put(2,p2);
		hs2.put(3,p3);
		hs2.put(1,p4);
		
		for(Integer Key: hs2.keySet()) {
			
			System.out.println(Key+": "+hs2.get(Key));
			
		}
		
		Set<Person> lhs1= new LinkedHashSet<Person>();
		
		lhs1.add(p1);
		lhs1.add(p2);
		lhs1.add(p3);
		lhs1.add(p4);
		
		System.out.println(lhs1);

	}

}
