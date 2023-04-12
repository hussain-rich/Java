package com.EIT.B6.GenericsChallange;

import java.util.ArrayList;

public class Team <T extends Player>implements Comparable<Team<T>> {
	
	private String name;
	int played=0;
	int won=0;
	int lost=0;
	int tied=0;
	
	private ArrayList<T> member=new ArrayList<T>();

	public Team(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public boolean addPlayer(T player) {
		if(member.contains(player)) {
			System.out.println(player.getName()+"is already on the team");
			return false;
		}else {
			member.add(player);
			System.out.println(player.getName()+"picked for team"+this.name);
			return true;
		}
	}
	public int member() {
		return this.member.size();
	}
	
	public int ranking() {
		return (won * 2)+ tied;
	}

	@Override
	public int compareTo(Team<T> team) {
		if(this.ranking() > team.ranking()) {
			return -1;
		}else if(this.ranking()< team.ranking()) {
			return 1;
		}else {
		return 0;
		}
	}

	public void matchResult(Team<T> opponent ,int ourScore,int theirScore) {
		
		if(ourScore >theirScore) {
			won++;
		}else if (ourScore==theirScore) {
			tied++;
		}else {
			lost++;
		}
		played++;
		if(opponent != null){
			opponent.matchResult(null, ourScore, theirScore);
		}
		
	}
	
	

}
