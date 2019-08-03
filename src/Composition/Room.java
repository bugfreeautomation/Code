package Composition;

public class Room {

	int door;
	int window;
	int furniture;

	public Room(int door, int window, int furniture) {

		this.door = door;
		this.window = window;
		this.furniture = furniture;

	}

	public int getDoor() {
		return door;
	}

	public void setDoor(int door) {
		this.door = door;
	}

	public int getWindow() {
		return window;
	}

	public void setWindow(int window) {
		this.window = window;
	}

	public int getFurniture() {
		System.out.println(furniture);
		return furniture;
	}

	public void setFurniture(int furniture) {
		this.furniture = furniture;
	}

	public int totalNumberOfRooms() {
		
		System.out.println("Total number of rooms are: " + 5);
		
		return 5;
	}

}
