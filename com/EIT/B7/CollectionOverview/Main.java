package com.EIT.B7.CollectionOverview;

public class Main {

	public static void main(String[] args) {
		Theatre theatre =new Theatre("olympian",8,12);
		theatre.getSeats();
		if(theatre.reserveSeat("h11")) {
			System.out.println("please pay");
		}else {
			System.out.println("sorry,thr seat is already taken");
		}
		if(theatre.reserveSeat("h11")) {
			System.out.println("olease pay");
		}else {
			System.out.println("sorry,thr seat is already taken");
		}

	}

}
