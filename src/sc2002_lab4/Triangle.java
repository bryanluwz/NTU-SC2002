package sc2002_lab4;

public class Triangle implements Shape2D {
    private float height;
    private float base;

    public Triangle(float height, float base) {
        this.height = height;
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    @Override
    public float calArea() {
        return this.getBase() * this.getHeight() / 2;
    }

    @Override
    public void printArea() {
        System.out.printf("Triangle of height %.2f and base %.2f has an area of %.3f\n", this.getHeight(), this.getBase(), this.calArea());
    }
}
