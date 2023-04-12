package com.EIT.B2.OOP.MasterChallenge.BillBurgers;

public class HealthyBurger extends HamBurger{
	private String healthyExtra1Name,healthyExtra2Name;
	private double healthyExtra1Price,healthyExtra2Price;
	
	public HealthyBurger( String meat, double price) {
		super("healthy burger",meat, "brown rey burger",price);		
	}

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }
    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }
    public double itemizehamburger(String meat, double price) {
		 System.out.println( " hamburger on a roll with " + meat + ", price is " + price);
	        if (healthyExtra1Name != null) {
	            System.out.println("Added " + healthyExtra1Name + " for an extra " + healthyExtra1Price);
	        }
	        if (healthyExtra2Name != null) {
	            System.out.println("Added " + healthyExtra2Name + " for an extra " + healthyExtra2Price);
	        }
	        return price;
	}
	

}
