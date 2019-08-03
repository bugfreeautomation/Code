package Generics_teamwithgenerics;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {

		// abstract class cannot be instantiated by itself, its done via other classes
		// that extend it

		Team<FootballPlayer> footballUK = new Team<FootballPlayer>("FootballUK");
		Team<SoccerPlayer> soccerUK = new Team<SoccerPlayer>("SoccerUK");
		Team<BaseballPlayer> baseballUK = new Team<BaseballPlayer>("BaseballUK");

		FootballPlayer fb = new FootballPlayer("Beckham");
		SoccerPlayer sp = new SoccerPlayer("Joe");
		BaseballPlayer bp = new BaseballPlayer("Stoke");

		// team.addPlayer(bp);
		footballUK.addPlayer(fb);
		// team.addPlayer(sp);
		// this works but here is one big problem, this team contains players of 3
		// different types
		// we need to ensure player of specific types are added to specific team
		// hence generic

		soccerUK.addPlayer(sp);
		baseballUK.addPlayer(bp);

		baseballUK.displayPlayerNames(bp);

		footballUK.compareTo(soccerUK); // interesting
		

	}

}
