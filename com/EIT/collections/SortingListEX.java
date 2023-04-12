package com.EIT.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		
		int len1=o1.length();
		int len2=o2.length();
		
		if(len1>len2) {
			return 1;
		}else if (len1<len2) {
			return -1;
		}
		
		return 0;
	}
	
	
}

class AlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}
	
	
}

public class SortingListEX {

	public static void main(String[] args) {
		List<String> li=new ArrayList<String>();
		
		li.add("zebra");
		li.add("cat");
		li.add("snake");
		li.add("elephant");
		li.add("fox");
		
		//Collections.sort(li,new StringLengthComparator());
		Collections.sort(li,new AlphabeticalComparator());
		
		for(String li1:li) {
			System.out.println(li1);
		}
		
		List<Integer> li2=new ArrayList<Integer>();
		
		li2.add(25);
		li2.add(15);
		li2.add(65);
		li2.add(2);
		li2.add(12);
		
		Collections.sort(li2);
		for(Integer li3:li2) {
			System.out.println(li3);
		}

	}

}
