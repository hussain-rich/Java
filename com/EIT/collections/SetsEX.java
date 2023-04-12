package com.EIT.collections;

import java.util.Set;
import java.util.TreeSet;

public class SetsEX {
	public static void main(String[] args) {
		TreeSet<String> one=new TreeSet<String>();
		one.add("venkat");
		one.add("babiyo");
		one.add("siva");
		one.add("maddy");
		one.add("ibu");
		
		System.out.println(one);
		
		if(one.contains("vallarasu")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
		if(one.contains("siva")) {
			System.out.println("true");
		}else {
			System.out.println("false");
		}
	}

}
