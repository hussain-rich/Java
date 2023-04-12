package com.EIT.B1.PolymorphismEX;

public class Mitsubishi extends Car {

	public Mitsubishi(int cylinder, String name) {
		super(cylinder, name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String startEngine() {
		// TODO Auto-generated method stub
		return "the"+getName()+"car is starting";
	}

	@Override
	public String accelerate() {
		// TODO Auto-generated method stub
		return "the"+getName()+"car is starting";
	}

	@Override
	public String brake() {
		// TODO Auto-generated method stub
		return "the"+getName()+"car is starting";
	}
	

}
