package com.EIT.collections;

import java.util.ArrayList;

public class ArrayListEX {

	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<Integer>();
		//adding....
		al.add(3);
		al.add(7);
		al.add(37);
		al.add(3785);
		//retriving....
		System.out.println(al.get(1));
		
		System.out.println("\nIteration#1: ");
		//indexed for loop iteration
		for(int i=0;i<al.size();i++) {
			System.out.println(al.get(i));
		}
		//removing item
				al.remove(al.size()-1);
				
				//remove slow
				al.remove(0);
		System.out.println("\nIteration#2: ");
		for(Integer values:al) {
			System.out.println(values);
		}
		

	}

}
