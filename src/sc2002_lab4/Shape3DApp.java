package sc2002_lab4;

import java.util.Scanner;

public class Shape3DApp {
    public static void main(String[] args) {
        int userInput = 0;
        Scanner sc = new Scanner(System.in);

        do {
            printStartMessage();
            userInput = sc.nextInt();
            switch (userInput) {
                case 1:
                    System.out.println("Enter radius and hypotenuse: ");
                    Cone cone = new Cone(sc.nextInt(), sc.nextInt());
                    cone.printArea();
                    break;
                case 2:
                    System.out.println("Enter length, breadth and height: ");
                    Cuboid cuboid = new Cuboid(sc.nextInt(), sc.nextInt(), sc.nextInt());
                    cuboid.printArea();
                    break;
                case 3:
                    System.out.println("Enter length: ");
                    RegularTetrahedron regularTetrahedron = new RegularTetrahedron(sc.nextInt());
                    regularTetrahedron.printArea();
                    break;
                case 4:
                    System.out.println("Enter radius: ");
                    Sphere sphere = new Sphere(sc.nextInt());
                    sphere.printArea();
                    break;
                case 5:
                    System.out.println("Enter radius and height: ");
                    Cylinder cylinder = new Cylinder(sc.nextInt(), sc.nextInt());
                    cylinder.printArea();
                    break;
                default:
                    break;
            }

        } while (userInput != 0);
    }

    public static void printStartMessage() {
        System.out.println("Choose your shape");
        System.out.println("0. Quit");
        System.out.println("1. Cone");
        System.out.println("2. Cuboid");
        System.out.println("3. Regular Tetrahedron");
        System.out.println("4. Sphere");
        System.out.println("5. Cylinder");
    }
}
