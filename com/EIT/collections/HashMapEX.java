 package com.EIT.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapEX {

	public static void main(String[] args) {
		HashMap<Integer,String> hs=new HashMap<Integer,String>();
		
		hs.put(1,"Venkat");
		hs.put(2, "Babiyo");
		hs.put(3,"siva");
		hs.put(4," Maddy");
		hs.put(5,"Vallarasu");
		
		hs.put(4,"ibu");
		
		System.out.println(hs.get(3));
		System.out.println(hs.get(4));
		
		for(Map.Entry<Integer,String> entry:hs.entrySet()) {
			
			int Key =entry.getKey();
			String value=entry.getValue();
			System.out.println(Key +": "+value);
			
		}

	}

}
