package Inheritance;

public class Vehicle {

	int steering;
	int gears;
	int speed;

	public Vehicle(int steering, int gears, int speed) {

		this.steering = steering;
		this.gears = gears;
		this.speed = speed;
	}

	public int getSteering() {
		return steering;
	}

	public void setSteering(int steering) {
		this.steering = steering;
	}

	public int getGears() {
		return gears;
	}

	public void setGears(int gears) {
		this.gears = gears;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void changeSpeed() {
		
		System.out.println("Vehicle speed changed");
		

	}

	public void changeGear() {
		
		System.out.println("Vehicle gear changed");

	}

}
