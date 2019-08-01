package Inheritance2;

public class Circle {
	double radius;

	public Circle(double radius) {
		if (radius < 0) {
			this.radius = 0;
		} else {
			this.radius = radius;
		}

	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getArea() {
		
		return this.radius * this.radius * 3.14;

	}
}