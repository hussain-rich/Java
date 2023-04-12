package com.EIT.B2.OOP.MasterChallenge.BillBurgers;

public class HamBurger {
	
	private String name,meat,breadRollType;
	private double price;
	public HamBurger(String name, String meat, String breadRollType, double price) {
		this.name = name;
		this.meat = meat;
		this.breadRollType = breadRollType;
		this.price = price;
	}
	private String addition1Name,addition2Name,addition3Name,addition4Name;
	private double addition1Price,addition2Price,addition3Price,addition4Price;
	
	public void addHamburgerAddition1(String name,double price) {
		this.addition1Name=name;
		this.addition1Price=price;
		this.price+=price;
	}
	public void addHamburgerAddition2(String name,double price) {
		this.addition2Name=name;
		this.addition2Price=price;
		this.price+=price;
	}
	public void addHamburgerAddition3(String name,double price) {
		this.addition3Name=name;
		this.addition3Price=price;
		this.price+=price;
	}
	public void addHamburgerAddition4(String name,double price) {
		this.addition4Name=name;
		this.addition4Price=price;
		this.price+=price;
	}
	public double itemizehamburger() {
		 System.out.println(name + " hamburger on a " + breadRollType + " roll with " + meat + ", price is " + price);
	        if (addition1Name != null) {
	            System.out.println("Added " + addition1Name + " for an extra " + addition1Price);
	        }
	        if (addition2Name != null) {
	            System.out.println("Added " + addition2Name + " for an extra " + addition2Price);
	        }
	        if (addition3Name != null) {
	            System.out.println("Added " + addition3Name + " for an extra " + addition3Price);
	        }
	        if (addition4Name != null) {
	            System.out.println("Added " + addition4Name + " for an extra " + addition4Price);
	        }
	        return price;
	}
	

}
