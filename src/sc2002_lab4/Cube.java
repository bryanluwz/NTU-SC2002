package sc2002_lab4;

public class Cube extends Cuboid {
    public Cube(float length) {
        super(length, length, length);
    }

    @Override
    public void printArea() {
        System.out.printf("Cube of length %.2f has an area of %.3f\n", this.getHeight(), this.calArea());
    }
}
