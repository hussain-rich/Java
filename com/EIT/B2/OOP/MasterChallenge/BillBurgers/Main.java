package com.EIT.B2.OOP.MasterChallenge.BillBurgers;

public class Main {

	public static void main(String[] args) {
		HamBurger hamburger = new HamBurger("Basic", "beef  ", "White", 3.56);
		hamburger.addHamburgerAddition1("Tomato", 0.27);
		hamburger.addHamburgerAddition2("Lettuce", 0.75);
		hamburger.addHamburgerAddition3("Cheese", 1.13);
		System.out.println("Total Burger price is " + hamburger.itemizehamburger());
		 
		HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
		healthyBurger.addHamburgerAddition1("Egg", 5.43);
		healthyBurger.addHamburgerAddition2("Lentils", 3.41);
		System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizehamburger());
		 
		DeluxeBurger db = new DeluxeBurger();
		db.addHamburgerAddition3("Should not do this", 50.53);
		System.out.println("Total Deluxe Burger price is " + db.itemizehamburger());

	}

}
