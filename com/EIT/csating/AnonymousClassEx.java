package com.EIT.csating;

class machine {

	public void start() {
		System.out.println("machine started");
	}
}

interface Plant{
	public void grow();
}

public class AnonymousClassEx {

	public static void main(String[] args) {
		machine mech = new machine() {

			@Override
			public void start() {
				System.out.println("machine running");
			}

		};
		mech.start();
		
		Plant plant1=new Plant() {

			@Override
			public void grow() {
				System.out.println("plant is growing");
				
			}
			
		};
		plant1.grow();

	}

}
