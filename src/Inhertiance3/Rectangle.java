package Inhertiance3;

public class Rectangle {
	
	double w;
	double l;
	
	
	public Rectangle(double w, double l) {
		super();
		this.w = w;
		this.l = l;
	}
	

	public double getW() {
		return w;
	}
	public void setW(double w) {
		this.w = w;
	}
	public double getL() {
		return l;
	}
	public void setL(double l) {
		this.l = l;
	}
	
	public double Area() {
		
		return this.w*this.l;
	}
	
}
