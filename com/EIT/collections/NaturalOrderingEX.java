package com.EIT.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person1{
	private String name;

	public Person1(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person1 [name=" + name + "]";
	}
	
}

public class NaturalOrderingEX {

	public static void main(String[] args) {
		
		List<Person1> list =new ArrayList<Person1>();
		SortedSet<Person1> set=new TreeSet<Person1>();
		
		addElements(list);
		addElements(set);
		
		//	Collections.sort(list);
		
		showElements(list);
		System.out.println();
		showElements(set);
	}
		
		public static void addElements(Collection<Person1> col) {
			col.add(new Person1("bob"));
			col.add(new Person1("mike"));
			col.add(new Person1("sue"));
			col.add(new Person1("joe"));
		}
		public static void showElements(Collection<Person1> col) {
			for(Person1 element:col) {
				System.out.println(element);
			}
		
		

	}

}
