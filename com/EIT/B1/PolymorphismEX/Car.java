package com.EIT.B1.PolymorphismEX;

public class Car {
	
	private boolean engine;
	private int cylinder;
	private String name;
	private int wheels=4;
	public Car(int cylinder, String name) {
		this.cylinder = cylinder;
		this.name = name;
		this.engine=true;
	}
	
	public String startEngine() {
		return "the"+name+"car is starting";
	}
	public String accelerate() {
		return "the"+name+"car is accelerating";
	}
	public String brake() {
		return "the"+name+"car is braking";
	}

	public int getCylinder() {
		return cylinder;
	}

	public String getName() {
		return name;
	}
	

}
