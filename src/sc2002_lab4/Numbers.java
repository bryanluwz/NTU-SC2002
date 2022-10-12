package sc2002_lab4;

import java.util.Scanner;

public class Numbers {
    // --------------------------------------------
    // Reads in an array of integers, sorts them,
    // then prints them in sorted order.
    // --------------------------------------------
    public static void main(String[] args) {
        Integer[] intList;
        Integer[] intListCopy;
        int size;

        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many integers do you want to sort? ");

        size = scan.nextInt();
        intList = new Integer[size];

        System.out.println("\nEnter the numbers...");

        for (int i = 0; i < size; i++)
            intList[i] = scan.nextInt();

        intListCopy = intList.clone();

        Sorting.insertionSort(intList);
        System.out.println("\nInsertion sort (descending): ");

        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + " ");
        System.out.println();

        Sorting.selectionSort(intListCopy);
        System.out.println("\nSelection sort (ascending): ");

        for (int i = 0; i < size; i++)
            System.out.print(intListCopy[i] + " ");
        System.out.println();
    }
}

/*
 * 5 5138008 1 420 69 -123456
 * */