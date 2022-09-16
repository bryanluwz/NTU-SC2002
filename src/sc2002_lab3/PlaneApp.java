package sc2002_lab3;

import java.util.Scanner;

public class PlaneApp {
    public static void main(String[] args) {
        final int NUM_SEATS = 12;
        int userChoice;
        int seatId, customerId;

        Scanner scanner = new Scanner(System.in);

        Plane plane = new Plane(NUM_SEATS);

        System.out.println("Hello welcome to Cheap Airlines");
        System.out.println("1. Show number of empty seats");
        System.out.println("2. Show the list of empty seats");
        System.out.println("3. Show the list of seat assignments by seat ID");
        System.out.println("4. Show the list of seat assignments by customer ID");
        System.out.println("5. Assign a customer to a seat");
        System.out.println("6. Remove a seat assignment");
        System.out.println("7. Quit");

        do {
            System.out.println("Enter the number of choice: ");

            userChoice = getInt(scanner, "Please enter a number >:(\nEnter the number of choice: ");

            switch (userChoice) {
                case 1 -> plane.showNumEmptySeats();
                case 2 -> plane.showEmptySeats();
                case 3 -> plane.showAssignedSeats(true);
                case 4 -> plane.showAssignedSeats(false);
                case 5 -> {
                    System.out.println("Assigning seat...");
                    System.out.println("Enter seat ID: ");
                    seatId = getInt(scanner, "Please enter a number >:(\nEnter seat ID:");
                    System.out.println("Enter customer ID: ");
                    customerId = getInt(scanner, "Please enter a number >:(\nEnter customer ID:");
                    plane.assignSeat(seatId, customerId);
                }
                case 6 -> {
                    System.out.println("Unassigning seat...");
                    System.out.println("Enter seat ID: ");
                    seatId = getInt(scanner, "Please enter a number >:(\nEnter seat ID:");
                    plane.unAssignSeat(seatId);
                }
                case 7 -> System.out.println("Bye bye...");
                default -> {
                    System.out.println("\n");
                    System.out.println("1. Show number of empty seats");
                    System.out.println("2. Show the list of empty seats");
                    System.out.println("3. Show the list of seat assignments by seat ID");
                    System.out.println("4. Show the list of seat assignments by customer ID");
                    System.out.println("5. Assign a customer to a seat");
                    System.out.println("6. Remove a seat assignment");
                    System.out.println("7. Quit");
                }
            }
        } while (userChoice != 7);
    }

    public static int getInt(Scanner sc, String errorMessage) {
        while (true) {
            try {
                return sc.nextInt();
            }
            catch (Exception e) {
                System.out.println(errorMessage);
                sc.next();
            }
        }
    }
}

// 5 10 10001 5 12 10002 5 8 10003 3 4 1 2 5 8 10004 6 10 5 12 10005 6 12 3 1 2
