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
}
