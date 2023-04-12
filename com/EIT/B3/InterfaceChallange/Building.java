package com.EIT.B3.InterfaceChallange;

enum UsageType{ENTERTAINMENT,GOVERNMENT,RESTIANTIAL,SPORTS}

public class Building implements Mappable {
	
	private String name;
	private UsageType usage;
	public Building(String name, UsageType usage) {
		this.name = name;
		this.usage = usage;
	}
	@Override
	public String getLable() {
		return name +" (" +usage+") ";
	}
	@Override
	public String getMarker() {
		return switch(usage) {
				case ENTERTAINMENT -> Color.GREEN +" "+ 	PointMarkers.TRIANGLE;
				case GOVERNMENT -> Color.RED +" "+ 	PointMarkers.STAR;
				case RESTIANTIAL -> Color.BLUE +" "+ 	PointMarkers.SQUARE;
				case SPORTS -> Color.ORANGE +" "+ 	PointMarkers.PUSH_PIN;
				default ->Color.BLACK+" "+ PointMarkers.CIRCLE;
		};
	}
	@Override
	public Geometry getShape() {
		return Geometry.POINT;
	}
	

}
