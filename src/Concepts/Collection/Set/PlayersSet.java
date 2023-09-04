package Concepts.Collection.Set;

import java.util.*;

class Player {
	
	private int id;
	private String name;
	private int age;
	private String location;
	private int goals;

	public Player(int id, String name, int age, String location, int goals) {
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getGoals() {
		return goals;
	}


	public void setGoals(int goals) {
		this.goals = goals;
	}
	
	
}


public class PlayersSet {

	public static void main(String[] args) {
		
		Set<Player> player = new HashSet<>();
		//id, name, age, location, goals
		player.add(new Player(101, "Carl", 25, "Scotland", 5));
		player.add(new Player(104, "John", 34, "Wales", 8));
		player.add(new Player(105, "Steve", 26, "Northern Ireland", 8));
		player.add(new Player(102, "Arthur", 30, "Northern Ireland", 8));
		player.add(new Player(102, "Philip", 25, "Wales", 8));
		
		for(Player p:player) {
			System.out.println(p.getAge()+ " "+ p.getGoals()+" "+p.getId()+ " "+p.getLocation()+ " "+p.getName());
		}

	}

}
