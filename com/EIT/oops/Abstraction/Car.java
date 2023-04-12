package com.EIT.oops.Abstraction;

public class Car extends Machine{

	@Override
	public void start() {
		System.out.println("car is started");
		
	}

	@Override
	public void doStuff() {
		System.out.println("car is running");
		
	}

	@Override
	public void shutdown() {
		System.out.println("car turned off");
		
	}

}
