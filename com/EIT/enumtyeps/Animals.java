package com.EIT.enumtyeps;

public enum Animals {
	CAT("tom"),DOG("scoopy"),MOUSE("jerry");
	
	private String name;

	private Animals(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	

}
