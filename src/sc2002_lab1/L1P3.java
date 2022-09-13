package sc2002_lab1;

import java.util.*;

public class L1P3 {
	public static void main(String args[]) {
		float USD2SGD = 1.82f;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter starting:");
		int starting = sc.nextInt();
		
		System.out.println("Enter end:");
		int end = sc.nextInt();
		
		System.out.println("Enter increment:");
		int increment = sc.nextInt();
		
		if (end <= starting) {
			System.out.println("Error");
			sc.close();
			return;
		}
		
		float sgd = 0f;
		int usd = 0;
		
		// for loop 
		System.out.println("US$       S$\r\n"
				+ "--------------");
		for (int i = starting; i <= end; i += increment) {
			usd = i;
			sgd = usd * USD2SGD;
			System.out.printf("%-10d%.2f\n", usd, sgd);
		}
		
		// while loop
		System.out.println("\n");
		
		System.out.println("US$       S$\r\n"
				+ "--------------");
		
		int j = starting;
		while (j <= end) {
			usd = j;
			sgd = usd * USD2SGD;
			System.out.printf("%-10d%.2f\n", usd, sgd);
			j += increment;
		}
		
		// do - while loop	
		System.out.println("\n");
			
		System.out.println("US$       S$\r\n"
				+ "--------------");
		
		int k = starting;
		do {
			usd = k;
			sgd = usd * USD2SGD;
			System.out.printf("%-10d%.2f\n", usd, sgd);
			k += increment;
		} while (k <= end);

		sc.close();
	}
}
