package com.EIT.interfaces;

public class machine implements info {
	
	private int id=7;
	public void start() {
		System.out.println(" machine started");
	}
	@Override
	public void showinfo() {
		
		System.out.println("the ID is "+ id);
		
	}


}
