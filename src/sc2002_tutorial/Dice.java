package sc2002_tutorial;

public class Dice {
	private int valueOfDice = 0;
	
	public Dice() {};
	
	public void setDiceValue() {
		this.valueOfDice = (int)(Math.random() * 6 + 1);
	}
	
	public int getDiceValue() {
		return this.valueOfDice;
	}
	
	public void printDiceValue() {
		System.out.println("Current value is: " + this.getDiceValue());
	}
}
