package sc2002_tutorial;
// This class is used in conjunction with Point.java
public class Circle2 extends Point {
	private double radius;
	
	public Circle2(int x, int y) {
		super(x, y);
	}

	public double getRadius() {
		return this.radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double area() {
		return this.getRadius() * this.getRadius() * Math.PI;
	}
}
