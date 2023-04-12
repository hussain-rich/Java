package com.EIT.InnerClass;

public class Robot {
	
	private int id;
	
	 private class Brain{
		
		public void think() {
			System.out.println("robot "+id+" is thinking" );
		}
	}
	 static class Battery{
		 public void charge() {
		 System.out.println("battery is chargingg" );
		 }
	 }

	public Robot(int id) {
		this.id = id;
	}
	
	public void start() {
		System.out.println("starting the robot"+id);
		
		Brain brain=new Brain();
		brain.think();
		
		String name="babiyo";
		
		class Temp{
			public void dostuff() {
				System.out.println("the ID is "+id);
				System.out.println("the name is "+name);
				
			}
		}
		Temp temp=new Temp();
		temp.dostuff();
	}
	

}
