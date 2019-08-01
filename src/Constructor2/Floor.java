package Constructor2;

public class Floor {
	double width;
	double length;
	
	public Floor(double width, double height) {
		this.width = width;
		this.length = height;
	}

	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	
	double getArea() {
		
		return this.width*this.length;
		
	}
	

}
