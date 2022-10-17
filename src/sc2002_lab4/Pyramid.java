package sc2002_lab4;

public class Pyramid extends Triangle {
    public Pyramid(float height, float base) {
        super(height, base);
    }

    @Override
    public float calArea() {
        return (float) (this.getBase() * this.getBase() + 2 * this.getBase() * Math.sqrt((this.getBase() * this.getBase() / 4) + this.getHeight() * this.getHeight()));
    }

    @Override
    public void printArea() {
        System.out.printf("Pyramid of base %.2f and height %.2f has an area of %.3f\n", this.getBase(), this.getHeight(), this.calArea());
    }
}
