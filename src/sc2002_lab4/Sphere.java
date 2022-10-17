package sc2002_lab4;

public class Sphere extends Circle {
    public Sphere(float radius) {
        super(radius);
    }

    @Override
    public float calArea() {
        return 4 * super.calArea();
    }

    @Override
    public void printArea() {
        System.out.printf("Sphere of radius %.2f has an area of %.3f\n", this.getRadius(), this.calArea());
    }
}
