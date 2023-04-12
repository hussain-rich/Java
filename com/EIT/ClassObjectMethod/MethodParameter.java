package com.EIT.ClassObjectMethod;

class Robot {
	public void speak(String text) {
		System.out.println(text);
	}

	public void jump(int height) {
		System.out.println("Jumbing: " + height);
	}

	public void move(String direction,double distance ) {
		System.out.println("The Direction IS "+direction+" and The Distance is "+distance);
	}
	
}

public class MethodParameter {
	public static void main(String[] args) {
		Robot model1 = new Robot();
		
		model1.speak("hi there");
		
		model1.jump(37);
		
		model1.move("North",37.5);
		
		String greting="hello there";
		model1.speak(greting);
	}

}
