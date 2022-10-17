package sc2002_lab4;

public class Cuboid extends Rectangle {
    private float height;

    public Cuboid(float length, float breadth, float height) {
        super(length, breadth);
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
        return 2 * (this.getHeight() * this.getBreadth() + this.getHeight() * this.getLength() + this.getBreadth() * this.getLength());
    }

    @Override
    public void printArea() {
        System.out.printf("Cuboid of length %.2f, breadth %.2f and height %.2f has an area of %.3f\n", this.getLength(), this.getBreadth(), this.getHeight(), this.calArea());
    }
}
