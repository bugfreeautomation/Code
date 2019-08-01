package Inhertiance3;

public class Cuboid extends Rectangle {
	
	double h;

	public Cuboid(double w, double l, double h) {
		super(w, l);
		this.h = h;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}
	
	
	public double getVolume() {
		
		return super.getL()*super.getW()*this.h;
	}
	

}
