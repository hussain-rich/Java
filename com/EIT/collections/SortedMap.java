package com.EIT.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedMap {

	public static void main(String[] args) {

		HashMap<Integer, String> hs1 = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> lhs = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> ts = new TreeMap<Integer, String>();
		System.out.println("HASHMAP");
		testMap(hs1);
		System.out.println("LINKEDHASHMAP");
        testMap(lhs);
        System.out.println("TREEMAP");
        testMap(ts);
	}
	
	public static void testMap(Map<Integer,String> map) {
		
		map.put(2,"dog");
		map.put(9,"fox");
		map.put(7,"horse");
		map.put(4,"zebra");
		map.put(6,"tiger");
		map.put(37,"lion");
		map.put(15,"mouse");
		map.put(3,"cat");
		
		for(Integer Key:map.keySet()) {
			String value =map.get(Key);
			
			System.out.println(Key+": "+value);
		}
		
	}

}
