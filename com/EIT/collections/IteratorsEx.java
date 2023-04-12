package com.EIT.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class IteratorsEx {

	public static void main(String[] args) {
		
		LinkedList<String> li=new LinkedList<String>();
		
		li.add("dog");
		li.add("fox");
		li.add("horse");
		li.add("cat");
		
		Iterator<String> it =li.iterator();
		
		while(it.hasNext()) {
			String values=it.next();
			System.out.println(values);
			
			if(values.equals("cat")) {
				it.remove();	
			}
		}
		
		for(String animal:li) {
			System.out.println(animal);
		}

	}

}
