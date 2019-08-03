package Composition;

public class House {

	Room room;
	Garden garden;
	int address;

	public House(Room room, Garden garden, int address) {
		this.room = room;
		this.garden = garden;
		this.address = address;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	public Garden getGarden() {
		return garden;
	}

	public void setGarden(Garden garden) {
		this.garden = garden;
	}

	public int getAddress() {
		return address;
	}

	public void setAddress(int address) {
		this.address = address;
	}
	

}
