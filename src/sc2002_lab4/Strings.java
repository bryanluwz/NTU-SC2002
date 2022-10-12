package sc2002_lab4;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        String[] stringList;
        String[] stringListCopy;
        int size;

        Scanner scan = new Scanner(System.in);
        System.out.print("\nHow many strings do you want to sort? ");

        size = scan.nextInt();
        stringList = new String[size];

        System.out.println("\nEnter the strings...");

        for (int i = 0; i < size; i++)
            stringList[i] = scan.next();

        stringListCopy = stringList.clone();

        Sorting.insertionSort(stringList);
        System.out.println("\nInsertion sort (descending): ");

        for (int i = 0; i < size; i++)
            System.out.print(stringList[i] + " ");
        System.out.println();

        Sorting.selectionSort(stringListCopy);
        System.out.println("\nSelection sort (ascending): ");

        for (int i = 0; i < size; i++)
            System.out.print(stringListCopy[i] + " ");
        System.out.println();
    }
}

/*
 * Testing conditions
 * 5 123 321 abc abcd dcba
 * */