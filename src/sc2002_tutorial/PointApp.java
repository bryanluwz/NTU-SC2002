package sc2002_tutorial;

public class PointApp {
	public static void main(String args[]) {
		Circle2 circ = new Circle2(0, 0);
		Cylinder cy = new Cylinder(0, 0);
		
		System.out.println(circ.toString());
		System.out.println(cy.toString());
		
		circ.setRadius(69);
		cy.setRadius(69);
		cy.setHeight(420);
		
		System.out.println(circ.area());
		System.out.println(cy.area());
		System.out.println(cy.volume());
	}
}
