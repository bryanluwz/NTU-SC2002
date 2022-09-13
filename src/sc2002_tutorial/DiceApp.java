package sc2002_tutorial;

import java.util.Scanner;

public class DiceApp {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Dice dice = new Dice();
		int total = 0;
		
		System.out.println("Press <key> to roll the first dice");
		
		while (!sc.hasNext());
		sc.next();
		
		dice.setDiceValue();
		dice.printDiceValue();
		total += dice.getDiceValue();
		
		System.out.println("Press <key> to roll the second dice");
		
		while (!sc.hasNext());
		sc.next();
		
		dice.setDiceValue();
		dice.printDiceValue();
		total += dice.getDiceValue();
		
		System.out.println("Your total number is: " + total);
		sc.close();
	}
}
