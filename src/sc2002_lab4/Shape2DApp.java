package sc2002_lab4;
import java.util.*;

public class Shape2DApp {
    public static void main(String[] args) {
        int userInput = 0;
        Scanner sc = new Scanner(System.in);

        do {
            printStartMessage();
            userInput = sc.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Enter length and breadth: ");
                    Rectangle rectangle = new Rectangle(sc.nextInt(), sc.nextInt());
                    rectangle.printArea();
                    break;
                case 2:
                    System.out.println("Enter length: ");
                    Square square = new Square(sc.nextInt());
                    square.printArea();
                    break;
                case 3:
                    System.out.println("Enter base and height: ");
                    Triangle triangle = new Triangle(sc.nextInt(), sc.nextInt());
                    triangle.printArea();
                    break;
                case 4:
                    System.out.println("Enter radius: ");
                    Circle circle = new Circle(sc.nextInt());
                    circle.printArea();
                    break;
                default:
                    break;
            }

        } while (userInput != 0);
    }

    public static void printStartMessage() {
        System.out.println("Choose your shape");
        System.out.println("0. Quit");
        System.out.println("1. Rectangle");
        System.out.println("2. Square");
        System.out.println("3. Triangle");
        System.out.println("4. Circle");
    }

}
