package com.EIT.B3.InterfaceChallange;

enum Geometry{LINE,POINT,POLYGON}
enum Color{BLACK,BLUE,GREEN,ORANGE,RED}
enum PointMarkers{CIRCLE,PUSH_PIN,STAR,SQUARE,TRIANGLE}

public interface Mappable {
	String JSON_PROPERTY="""
			"properties":{%s}
			""";
	
	String getLable();
	String getMarker();
	Geometry getShape();
	
	default String toJSON() {
		return """
				"type": "%s","label": "%s",marker:"%s"
				""".formatted(getShape(),getLable(),getMarker());
	}
	static void mapit(Mappable mappable) {
		System.out.println(JSON_PROPERTY.formatted(mappable.toJSON()));
	}

}
