package com.EIT.enumtyeps;

public class App {
	
	

	public static void main(String[] args) {
		
		Animals animal=Animals.MOUSE;
		
		switch(animal) {
		case CAT:
			System.out.println("CAt");
			break;
		case DOG:
			System.out.println("DOG");
			break;
		case MOUSE:
			System.out.println("MOUSE");
			break;
		default:
			break;
		
		}
		
		System.out.println(Animals.MOUSE.getName());

	}

}
