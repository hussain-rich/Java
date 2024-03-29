package com.EIT.A8.CompositionEX;

public class BedRoom {
	private String name;
	private Wall wall1,wall2,wall3,wall4;
	private Celling celling;
	private Bed bed;
	private Lamp lamp;
	public BedRoom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Celling celling, Bed bed, Lamp lamp) {
		this.name = name;
		this.wall1 = wall1;
		this.wall2 = wall2;
		this.wall3 = wall3;
		this.wall4 = wall4;
		this.celling = celling;
		this.bed = bed;
		this.lamp = lamp;
	}
	public Lamp getLamp() {
		return lamp;
	}
	public void makeBed() {
		System.out.println("the bed is being made");
		System.out.println("BedRoom -> Making bed |");
		bed.make();
	}
	

}
