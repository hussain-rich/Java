package com.EIT.csating;

class Machine1 {

	public void start() {
		System.out.println("machine is running");

	}
}

class Car extends Machine1 {

	public void start() {
		System.out.println("car is running");
	}

	public void snap() {
		System.out.println("photo is taken");
	}
}

public class UpCastingandDownCasting {

	public static void main(String[] args) {

		Machine1 machine1 = new Machine1();
		Car car1 = new Car();
		
		machine1.start();
		car1.start();
		car1.snap();
		
		//upcasting
		
		Machine1 machine2=new Car();
		machine2.start();
		// error: machine2.snap();
		
		//downcasting
		Machine1 machine3=new Car();
		Car car2=(Car)machine3;
		car2.start();
		car2.snap();
	}

}
