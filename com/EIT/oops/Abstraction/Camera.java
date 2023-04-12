package com.EIT.oops.Abstraction;

public class Camera extends	 Machine {

	@Override
	public void start() {
		System.out.println("camera snapping");
		
	}

	@Override
	public void doStuff() {
		System.out.println("camera recording video");
		
	}

	@Override
	public void shutdown() {
		System.out.println("camera shutting down");
		
	}

}
