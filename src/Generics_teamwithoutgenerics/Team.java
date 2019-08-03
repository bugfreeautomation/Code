package Generics_teamwithoutgenerics;

import java.util.ArrayList;

public class Team {

	private String name;
	private int numOfPlayer = 0;
	Player player;
	ArrayList<Player> totalplayers = new ArrayList<Player>();


	public Team(String name) {
		this.name = name;
	}


	public int addPlayer(Player player) {

		if (totalplayers.contains(player)) {

			System.out.println("Player already exists : " + player.getName());

			
			return numOfPlayer;
			
		} else {
			
			System.out.println("Player added to team : " + player.getName());

			
			totalplayers.add(player);
			
			numOfPlayer = numOfPlayer + 1;

			System.out.println(numOfPlayer);
			
			return numOfPlayer;
		}
	}

}
