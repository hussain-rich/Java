package com.EIT.A2.PersonEX;

public class Person {
	private String firstName;
	private String secondName;
	private int age;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getsecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isTeen() {
		return(age>12 &&age<20) ;
	}
	public String getFullName(){
		if(firstName.isEmpty() &&secondName.isEmpty()) {
			return " ";
		}else if(firstName.isEmpty()){
			return secondName;
		}else if(secondName.isEmpty()) {
			return firstName;
		}else {
			return firstName+" "+secondName;
		}
		
	}
	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName("");   // firstName is set to empty string
		person.setSecondName("");    // lastName is set to empty string
		person.setAge(10);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setFirstName("John");    // firstName is set to John
		person.setAge(18);
		System.out.println("fullName= " + person.getFullName());
		System.out.println("teen= " + person.isTeen());
		person.setSecondName("Smith");    // lastName is set to Smith
		System.out.println("fullName= " + person.getFullName());
	}

}
