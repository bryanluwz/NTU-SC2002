package sc2002_lab1;

import java.util.*;

public class L1P4 {
	public static void main(String args[]) {
		System.out.println("Enter height: ");
		Scanner sc = new Scanner(System.in);
		int height = sc.nextInt();
		if (height <= 0) {
			System.out.println("Error");
			sc.close();
			return;
		}
		
		String output = "";
		
		for (int i = 1; i <= height; i++) {
			if (i % 2 == 1) {
				output = "AA" + output;
			}
			else {
				output = "BB" + output;
			}
			
			System.out.println(output);
		}

		sc.close();
	}
}
