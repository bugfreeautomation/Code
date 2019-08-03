package Generics_teamwithgenerics;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>> {

	private String name;
	private int numOfPlayer = 0;
	Player player;
	ArrayList<T> totalplayers = new ArrayList<>();

	public Team(String name) {
		this.name = name;
	}

	public int addPlayer(T player) {

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

	public void displayPlayerNames(T player) {

		System.out.println("Name is : " + player.getName());

	}

	@Override
	public int compareTo(Team team) {

		// public int compareTo(Team<T> team) == WE specifing tyep of team, we cant
		// comapre football to football, therefore remove <T> here

		if (this.numOfPlayer == team.numOfPlayer) {
			System.out.println("Both teams have same number of players");
			return 1;
		} else {
			return 0;
		}
	}

}
