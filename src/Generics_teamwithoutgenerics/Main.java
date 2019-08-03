package Generics_teamwithoutgenerics;

public class Main {

	public static void main(String[] args) {

		// abstract class cannot be instantiated by itself, its done via other classes
		// that extend it

		Team team = new Team("Manchester City");

		FootballPlayer fb = new FootballPlayer("Beckham");
		SoccerPlayer sp = new SoccerPlayer("Joe");
		BaseballPlayer bp = new BaseballPlayer("Stoke");
		

		team.addPlayer(bp);
		team.addPlayer(fb);
		team.addPlayer(sp);
		// this works but here is one big problem, this team contains players of 3 different types
		// we need to ensure player of specific types are added to specific team
		// hence generic
		

	}

}
