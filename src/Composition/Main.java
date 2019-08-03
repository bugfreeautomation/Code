package Composition;

public class Main {

	public static void main(String[] args) {

		House house = new House(new Room(1, 2, 12), new Garden(100), 201008);
		
		house.room.getFurniture();
		house.room.totalNumberOfRooms();

	}

}
