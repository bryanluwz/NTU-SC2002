package sc2002_lab4;

public class Shape2DApp {
    public static void main(String[] args) {
        // Circle, triangle, and rectangle
        Circle circle = new Circle(10);
        Triangle triangle = new Triangle(25, 20);
        Rectangle rectangle = new Rectangle(50, 20);

        float circleArea = circle.calArea();
        float triangleArea = triangle.calArea();
        float rectangleArea = rectangle.calArea();
        float totalArea = circleArea + triangleArea + rectangleArea;

        System.out.println("Area of circle\t\t: " + circleArea);
        System.out.println("Area of triangle\t: " + triangleArea);
        System.out.println("Area of rectangle\t: " + rectangleArea);
        System.out.println("Area of all shapes\t: " + totalArea);
    }
}
