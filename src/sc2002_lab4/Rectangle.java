package sc2002_lab4;

public class Rectangle implements Shape2D {
    private float length;
    private float breadth;

    public Rectangle(float length, float breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public float getBreadth() {
        return breadth;
    }

    public void setBreadth(float breadth) {
        this.breadth = breadth;
    }

    @Override
    public float calArea() {
        return this.getBreadth() * this.getLength();
    }

    @Override
    public void printArea() {
        System.out.printf("Rectangle of length %.2f and breadth %.2f has an area of %.3f\n", this.getLength(), this.getBreadth(), this.calArea());
    }
}
