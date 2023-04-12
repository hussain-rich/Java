package com.EIT.B5.ArrayListChallange;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static Scanner sc =new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean flag=true;
		ArrayList<String> groceries=new ArrayList<String>();
		while(flag) {
			printActions();
			switch(Integer.parseInt(sc.nextLine())) {
			case 1 -> addItems(groceries);
			case 2 -> removeItems(groceries);
			default ->flag=false;
			}
			groceries.sort(Comparator.naturalOrder());
			System.out.println(groceries);
		}		
	}
	private static void addItems(ArrayList<String> groceries) {
		System.out.println("ADD ITEMSS: ");
		String[] items=sc.nextLine().split(",");
	//	groceries.addAll(List.of(items));
		
		for(String i:items) {
			String trimmed =i.trim();
			if(groceries.indexOf(trimmed)<0) {
				groceries.add(trimmed);
			}
		}
	}
	
	private static void removeItems(ArrayList<String> groceries) {
		System.out.println("REMOVE ITEMSS: ");
		String[] items=sc.nextLine().split(",");
		
		for(String i:items) {
			String trimmed =i.trim();
				groceries.remove(trimmed);
			
		}
	}
	
	private static void printActions() {
		String textBlock="""
				Available Actions:
				
				0-to shutdown
				
				1-to add to list
				
				2to remove any items
				
				Enter a number for which action to you want:
				""";
		System.out.println(textBlock+" ");
	}

}
