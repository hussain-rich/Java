package com.EIT.oops.Abstraction;

public class App {

	public static void main(String[] args) {
		Camera cam1=new Camera();
		cam1.setId(3);
		cam1.run();
		
		Car car1=new Car();
		car1.setId(7);
		car1.run();
	}

}
