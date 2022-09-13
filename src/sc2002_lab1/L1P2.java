package sc2002_lab1;

import java.util.*;

public class L1P2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int salary = 69;
		int merit;
		char grade = 'C';
		
		while (true) {
			System.out.println("Input salary and merit:");
			salary = sc.nextInt();
			
			// break when salary is -1
			if (salary == -1) {
				break;
			}
			
			merit = sc.nextInt();
			
			if (500 <= salary && salary <= 649) {
				if (600 <= salary && salary <= 649) {
					if (merit < 10) {
						grade = 'C';
					}
					else {
						grade = 'B';
					}
				}
				else {
					grade = 'C';
				}
			} 
			else if (600 <= salary && salary <= 799) {
				if (700 <= salary && salary <= 799) {
					if (merit < 20) {
						grade = 'B';
					}
					else {
						grade = 'A';
					}
				}
				else {
					grade = 'B';
				}
			} 
			else if (700 <= salary && salary <= 899) {
				grade = 'A';
			}
			
			System.out.println(grade);
		}
		sc.close();
	}
}

/* 
500 10 610 5 610 10 710 15 710 20 800 30 -1

C C B B A A

500 10 
610 5 
610 10 
710 15 
710 20 
800 30 
-1

 */
