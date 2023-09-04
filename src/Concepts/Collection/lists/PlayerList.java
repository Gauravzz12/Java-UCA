package Concepts.Collection.lists;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/*
 * Array List:
 * 1) Ordered Collection
 * 2)Duplicate Value
 * 3)Not Synchronized
 * 4)Re-Sizeable Array/Dynamic Array
 * 5)Allows Null Values
 */
@SuppressWarnings("unused")
public class PlayerList {

	public static void main(String[] args) {
		
		// 3 Methods of Declaration
		
		//Collection<String> player=new ArrayList<>();  
		List<String> player=new ArrayList<>();
		//ArrayList<String> player=new ArrayList<>();
		player.add("Player_01");
		player.add("Player_02");
		player.add("Player_03");
		player.add("Player_04");
		player.add("Player_05");
		
		System.out.println(player);
		for(String name: player) {
			System.out.println(name);
		}
		ArrayList<String> newPlayer=new ArrayList<String>(player);
		System.out.println(newPlayer);
		
		//Iterator Method
		Iterator<String>teamIterator=newPlayer.iterator();
		while(teamIterator.hasNext()) {
			String p=teamIterator.next();
			System.out.println(p);
		}
		
		//List-Iterator
		ListIterator<String> teamListIterator=newPlayer.listIterator(newPlayer.size());
		while(teamListIterator.hasPrevious()) {
			String p=teamListIterator.previous();
			System.out.println(p);
		}
	}

}
