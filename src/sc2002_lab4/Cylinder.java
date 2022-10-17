package sc2002_lab4;

public class Cylinder extends Circle{
    private float height;

    public Cylinder(float radius, float height) {
        super(radius);
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    @Override
    public float calArea() {
        return super.calArea() * 2 + 2 * (float) Math.PI * this.getRadius() * this.getHeight();
    }

    @Override
    public void printArea() {
        System.out.printf("Cylinder of radius %.2f and height %.2f has an area of %.3f\n", this.getRadius(), this.getHeight(), this.calArea());
    }
}
