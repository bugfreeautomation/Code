package Inheritance;

public class Car extends Vehicle{
	

	public Car(int steering, int gears, int speed) {
		super(steering, gears, speed);
		
	}

	@Override
	public void changeSpeed() {
		super.changeSpeed();
	}

	@Override
	public void changeGear() {
	
		super.changeGear();
		//System.out.println("Car gear changed");
	}
	
	

	

}
