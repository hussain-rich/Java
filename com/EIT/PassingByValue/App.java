package com.EIT.PassingByValue;

public class App {

	public static void main(String[] args) {
		
		App app =new App();
		//===================================================
		int value=7;
		System.out.println("THE FIRST VALUE IS: "+value);
		
		app.show(value);
		System.out.println("THE FOURTH VALUE IS: "+value);
		//===================================================
		System.out.println();
		Person p=new Person("venkat");
		System.out.println("THE FIRST PERSON IS: "+p);
		app.show(p);
		System.out.println("THE FOURTH PERSON IS: "+p);

	}
	public void show(int value) {
		System.out.println("THE SECOND VALUE IS: "+value);
		
		 value =8;
		
		System.out.println("THE THIRS VALUE IS: "+ value);
	}
	public void show(Person p) {
		System.out.println("THE SECOND PERSON IS: "+p);
		p.setName("BABIYO");
		p=new Person("mike");
		System.out.println("THE THIRD PERSON IS: "+p);
	}

}
