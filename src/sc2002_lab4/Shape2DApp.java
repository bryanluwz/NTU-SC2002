package sc2002_lab4;

public class Shape2DApp {
    public static void main(String[] args) {
        // Circle, triangle, and rectangle
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(25, 20);
        Rectangle rectangle = new Rectangle(50, 20);

        circle.printArea();
        triangle.printArea();
        rectangle.printArea();
    }
}
