package Inheritance2;

public class Cylinder extends Circle {

	double height;

	public Cylinder(double radius, double height) {
		super(radius);

		if (height < 0) {
			this.height = 0;
		} else {
			this.height = height;
		}

	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getVolume() {

		return super.getArea() * this.height;

	}

}
