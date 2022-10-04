package sc2002_tutorial5;

public class TestPolygon {
    public static void printArea(Rectangle r) {
        System.out.println("Area of " + r.getPolytype() + ": " + r.calArea());
    }

    public static void printArea(Triangle t) {
        System.out.println("Area of " + t.getPolytype() + ": " + t.calArea());
    }

    public static void main(String[] args) {
        Rectangle r = new Rectangle("Bob", 6, 9);
        Triangle t = new Triangle("Aloysius", 4, 20);

        printArea(r);
        printArea(t);
    }
}
