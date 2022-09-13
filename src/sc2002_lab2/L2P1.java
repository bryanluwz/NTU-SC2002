package sc2002_lab2;

import java.util.Scanner;

public class L2P1 {
    private static int randomInteger(int min, int max) {
        return (int) (Math.random() * (max - min) + min);
    }

    // Method for testing multiplication
    private static void mulTest() {
        Scanner sc = new Scanner(System.in);

        int min = 1;
        int max = 9;
        int userAnswer = -1;
        int correctAnswer = -1;
        int num1, num2;
        int correctCount = 0;

        String question = "";

        for (int i = 0; i < 5; i++) {
            question = "How much is %d times %d? ";
            num1 = randomInteger(min, max);
            num2 = randomInteger(min, max);
            correctAnswer = num1 * num2;
            System.out.printf(question, num1, num2);

            if (!sc.hasNextInt()) {
                return;
            }
            userAnswer = sc.nextInt();

            correctCount = userAnswer == correctAnswer ? correctCount + 1 : correctCount;
            System.out.println();
        }

        System.out.printf("%d out of 5 answers are correct.\n\r", correctCount);
        System.out.println();
    }

    // Method for divide
    public static int divide(int m, int n) {
        int quotient = -1;
        while (m > 0) {
            m -= n;
            quotient++;
        }
        return quotient;
    }

    // Method for modulus
    public static int modulus(int m, int n) {
        while (m > 0) {
            m -= n;
        }
        return m + n;
    }

    // Method for counting digits
    public static int countDigits(int n) {
        int digitsCount = 0;
        while (n > 0) {
            n /= 10;
            digitsCount++;
        }
        return digitsCount;
    }

    // Method for get the position of the first digit that appears in a number
    public static int position(int n, int digit) {
        int pos = 1;
        while (n > 0) {
            if (n % 10 == digit) {
                return pos;
            }
            n /= 10;
            pos ++;
        }

        return -1;
    }

    // Method for returning only odd digits from numbers
    public static long extractOddDigits(long n) {
        long odd = 0;
        double expo = 0;
        while (n > 0) {
            if (n % 2 == 1) {
                odd = odd + (n % 10) * (long) Math.pow(10, expo);
                expo++;
            }
            n /= 10;
        }

        if (odd == 0) {
            return -1;
        }

        return odd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 1;
        int m, n;

        do {
            System.out.println("Perform the following methods:");
            System.out.println("1: Multiplication test");
            System.out.println("2: Quotient using division by subtraction");
            System.out.println("3: Remainder using division by subtraction");
            System.out.println("4: Count the number of digits");
            System.out.println("5: Position of a digit");
            System.out.println("6: Extract all odd digits");
            System.out.println("7: Quit");

            choice = sc.nextInt();

            switch (choice) {
                case 1: /* add mulTest() call */
                    mulTest();
                    break;
                case 2: /* add divide() call */
                    System.out.println("Enter first number: ");
                    m = sc.nextInt();
                    System.out.println("Enter second number: ");
                    n = sc.nextInt();
                    System.out.printf("Quotient is %d.", divide(m, n));
                    System.out.println();
                    break;
                case 3: /* add modulus() call */
                    System.out.println("Enter first number: ");
                    m = sc.nextInt();
                    System.out.println("Enter second number: ");
                    n = sc.nextInt();
                    System.out.printf("Remainder is %d.", modulus(m, n));
                    System.out.println();
                    break;
                case 4: /* add countDigits() call */
                    System.out.println("Enter number: ");
                    n = sc.nextInt();
                    if (n <= 0) {
                        System.out.println("Error input! >:(");
                        break;
                    }
                    System.out.printf("Digits: %d", countDigits(n));
                    System.out.println();
                    break;
                case 5: /* add position() call */
                    System.out.println("Enter number: ");
                    m = sc.nextInt();
                    System.out.println("Enter digit: ");
                    n = sc.nextInt();
                    System.out.printf("Digit at position %d.", position(m, n));
                    System.out.println();
                    break;
                case 6: /* add extractOddDigits() call */
                    System.out.println("Enter number: ");
                    long t = sc.nextLong();
                    if (t <= 0) {
                        System.out.println("Error input! >:(");
                        break;
                    }
                    System.out.printf("Extract Odd Digits: %d.", extractOddDigits(t));
                    System.out.println();
                    break;
            }
        } while (choice < 7);

        System.out.println("Bye bye :P");

        sc.close();
    }
}
