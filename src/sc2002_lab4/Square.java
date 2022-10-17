package sc2002_lab4;

public class Square extends Rectangle {
    public Square(float length) {
        super(length, length);
    }

    @Override
    public void printArea() {
        System.out.printf("Rectangle of length %.2f has an area of %.3f\n", this.getLength(), this.calArea());
    }
}
