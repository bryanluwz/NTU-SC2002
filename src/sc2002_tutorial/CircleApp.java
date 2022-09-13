package sc2002_tutorial;

import java.util.Scanner;

public class CircleApp {
	public static void main(String args[]) {
		Circle c = new Circle(0f);
		boolean isCircleCreated = false;
		Scanner sc = new Scanner(System.in);
		
		int userChoice = 0;
		
		do {
			System.out.println("==== Circle Computation =====");
			System.out.println("|1. Create a new circle     |");
			System.out.println("|2. Print area              |");
			System.out.println("|3. Print circumference     |");
			System.out.println("|4. Quit                    |");
			System.out.println("=============================");
			
			userChoice = sc.nextInt();
			
			switch (userChoice) {
			// Create new circle, make sure user make circle before calling 2 and 3
			case 1:
				System.out.println("Enter the radius to compute the area and circumference: ");
				c = new Circle(sc.nextDouble());
				isCircleCreated = true;
				System.out.println("A new circle is created");
				break;
				
			// Print area of circle
			case 2:
				if (!isCircleCreated) {
					System.out.println("Please create a circle first >:(");
					break;
				}
				c.printArea();
				break;
				
			// Print circumference of circle
			case 3:
				if (!isCircleCreated) {
					System.out.println("Please create a circle first >:(");
					break;
				}
				c.printCircumference();
				break;
			}
		} while (userChoice < 4);
		
		System.out.println("Bye bye :>");
		sc.close();
	}
}
