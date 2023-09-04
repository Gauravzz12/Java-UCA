package Concepts.Collection.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
class Player{
	private  String name;
	private int age;
	public Player(String name,int age) {
		this.name=name;
		this.age=age;
		}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
public class Players {

	public static void main(String[] args) {
		List<Player> player=new ArrayList<Player>();
		player.add(new Player("Carl", 25));
		player.add(new Player("John", 34));
		player.add(new Player("Steve", 29));
		
		for(Player p: player) {
			System.out.println(p.getName()+" : "+p.getAge());
		}
		
		Iterator<Player> it=player.iterator();
		while(it.hasNext()) {
			Player p=it.next();
			System.out.println(p.getName()+ " " + p.getAge());
		}
		ListIterator<Player>ite=player.listIterator();
		while(ite.hasNext()) {
			Player p=ite.next();
			System.out.println(p.getName());
		}
		ListIterator<Player>iteB=player.listIterator(player.size());
		while(iteB.hasPrevious()) {
			Player p=iteB.previous();
			System.out.println(p.getName());
		}
	}
}
