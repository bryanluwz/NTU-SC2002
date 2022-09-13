package sc2002_tutorial;

public class Point {
	protected int x, y;
	
	public Point(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	
	public String toString() {
		return "[" + x + ", " + y + "]";
	}
	
	public void setPoint(int x, int y) {
		this.x = x; 
		this.y = y;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
}
