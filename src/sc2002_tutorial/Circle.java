package sc2002_tutorial;

public class Circle {
	private double radius;
	private static final double PI = 3.14159;

	// Constructor
	public Circle(double rad) {
		this.radius = rad;
	}

	// Mutator method
	public void setRadius(double rad) {
		this.radius = rad;
	}

	// Accessor method
	public double getRadius() {
		return this.radius;
	}

	// Calculate area
	public double area() {
		return PI * this.radius * this.radius;
	}

	// Calculate circumference
	public double circumference() {
		return 2 * PI * this.radius;
	}

	// Print area
	public void printArea() {
		System.out.printf("Area of circle is %.2f.\n", this.area());
	}

	// Print circumference
	public void printCircumference() {
		System.out.printf("Circumference of circle is %.2f.\n", this.circumference());
	}
}
