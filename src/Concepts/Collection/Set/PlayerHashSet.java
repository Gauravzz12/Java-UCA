package Concepts.Collection.Set;

import java.util.*;

public class PlayerHashSet {

	public PlayerHashSet() {
	}

	public static void main(String[] args) {

		
		Collection<String> player = new HashSet<>();
		player.add("Player_01");
		player.add("Player_02");
		player.add("Player_03");
		player.add("Player_04");
		player.add("Player_05");
		player.add("Player_06");
		
		for(String name : player) {
			System.out.println(name);
		}
		
		
		
		
		ArrayList<String> oldTeam = new ArrayList<>();
		oldTeam.add("Player_01");
		oldTeam.add("Player_02");
		oldTeam.add("Player_03");
		oldTeam.add("Player_04");
		oldTeam.add("Player_05");
		oldTeam.add("Player_03");
		
		System.out.println("Old Team : ");
		for(String player1 : oldTeam) {
			System.out.println(player1);
		}
		
		
		HashSet<String> newTeam = new HashSet<>(oldTeam);
		System.out.println("New Team : ");
		for(String player1 : newTeam) {
			System.out.println(player1);
		}
		
		HashSet<String> numbers=new HashSet<String>();
		numbers.add("3");
		numbers.add("7");
		numbers.add("8");
		numbers.add("5");
		numbers.add("6");
		
		for(String i : numbers) {
			System.out.println(i);
		}
		
	}

}
