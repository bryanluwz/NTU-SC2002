package sc2002_tutorial;
// This class is used in conjunction with Point.java
public class Cylinder extends Circle2 {
	private double height;
	
	public Cylinder(int x, int y) {
		super(x, y);
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double area() {
		return 2 * super.area() + 2 * Math.PI * this.getRadius() * this.getHeight();
	}
	
	public double volume() {
		return super.area() * this.getHeight();
	}
}
