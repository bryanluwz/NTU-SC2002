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
}
