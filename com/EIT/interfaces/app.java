package com.EIT.interfaces;

public class app {

	public static void main(String[] args) {
		
		machine machine1=new machine();
		machine1.start();
		
		Person person1 =new Person("ibu");
		person1.greet();
		
		info info1=new machine();
		info1.showinfo();
		
		info info2=new Person("ibu");
		info2.showinfo();

	}

}
