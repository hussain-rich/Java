package com.EIT.B3.InterfaceChallange;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Mappable> mappable =new ArrayList<Mappable>();
		mappable.add(new Building("town hall",UsageType.GOVERNMENT));
		mappable.add(new Building("opera house",UsageType.ENTERTAINMENT));
		mappable.add(new Building("stadium",UsageType.SPORTS));
		
		for(var m:mappable) {
			Mappable.mapit(m);
		}
	}

}
