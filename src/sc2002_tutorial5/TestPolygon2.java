package sc2002_tutorial5;

public class TestPolygon2 {
    public static void printArea(Polygon p) {
        System.out.println("Area of triangle: " + p.calArea());
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("Bob", 6, 9);
        Triangle t = new Triangle("Aloysius", 4, 20);

        printArea(r);
        printArea(t);
    }
}

