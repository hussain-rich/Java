package com.EIT.B6.GenericsChallange;

public class Main {

	public static void main(String[] args) {

		League<Team<FootballPlayer>> footballLeague=new League<>("FIFA");
		Team<FootballPlayer> argentina=new Team<>("Argentina");
		Team<FootballPlayer> portugal=new Team<>("Portugal");
		Team<FootballPlayer> france=new Team<>("France");
		Team<FootballPlayer> corotia=new Team<>("Corotia");
		

		argentina.matchResult(corotia,1,0);
		argentina.matchResult(portugal,3,8);
		
		portugal.matchResult(france,2,1);
		
		footballLeague.add(argentina);
		footballLeague.add(portugal);
		footballLeague.add(france);
		footballLeague.add(corotia);
		
		footballLeague.showLeagueTable();
		
	}

}
