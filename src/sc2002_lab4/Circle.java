package sc2002_lab4;

public class Circle implements Shape2D {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public float calArea() {
        return this.radius * this.radius * (float) Math.PI;
    }

    @Override
    public void printArea() {
        System.out.printf("Circle of radius %.2f has an area of %.3f\n", this.getRadius(), this.calArea());
    }
}
