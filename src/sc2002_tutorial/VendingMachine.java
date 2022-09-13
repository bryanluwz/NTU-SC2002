package sc2002_tutorial;
 
import java.util.Scanner; 

public class VendingMachine {
	private Scanner sc = new Scanner(System.in);
	// Constructor
	public VendingMachine() {
		
	}

	public void start() {
		double price = this.selectDrink();
		double totalAmount = this.insertCoins(price);
		this.checkChange(totalAmount, price);
		this.printReceipt();
	}
	
	// Get the drink selection and return the cost of the drink
	private double selectDrink() {
		// 1 is beer for $3, 2 is coke for $1, 3 is green tea for $5
		int userChoice = 4;
		double[] priceArray = new double[3];
		priceArray[0] = 3.00;
		priceArray[1] = 1.00;
		priceArray[2] = 5.00;
		
		while (userChoice > 3 || userChoice < 1) {
			System.out.println("==== Drink Selection ========");
			System.out.println("|1. Buy Beer ($3.00)        |");
			System.out.println("|2. Buy Coke ($1.00)        |");
			System.out.println("|3. Buy Green Tea ($5.00)   |");
			System.out.println("=============================");
			System.out.println("Please enter selection:");
			
			userChoice = sc.nextInt();
		}
		
		return priceArray[userChoice - 1];
	}
	
	// Insert the coins and returns the amount inserted
	private double insertCoins(double drinkCost) {
		System.out.println("Please insert coins:");
		System.out.println("========== Coins Input ===========");
		System.out.println("|Enter 'Q' for ten cents input   |");
		System.out.println("|Enter 'T' for twenty cents input|");
		System.out.println("|Enter 'F' for fifty cents input |");
		System.out.println("|Enter 'N' for a dollar input    |");
		System.out.println("==================================");
		
		double totalAmount = 0;
		char userChoice;
		
		while (totalAmount < drinkCost) {
			userChoice = sc.next().charAt(0);
			switch (userChoice) {
				case 'Q' -> totalAmount += 0.1;
				case 'T' -> totalAmount += 0.2;
				case 'F' -> totalAmount += 0.5;
				case 'N' -> totalAmount += 1;
			}
			System.out.printf("Coins inserted: $%.2f\n", totalAmount);
		}		
		return totalAmount;
	}
	
	// Check the change and print the change on screen
	private void checkChange(double amount, double drinkCost) {
		double change = amount - drinkCost;
		System.out.printf("Change: $%.2f\n", change);
	}
	
	// Print the receipt and collect the drink
	private void printReceipt() {
		System.out.println("PLease collect your drink");
		System.out.println("Thank you!!");
	}
}
