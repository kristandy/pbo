package minggu9_kasus3;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        // int[] intList;
        Comparable[] intList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many integers do you want to sort?");
        size = scan.nextInt();
        // intList = new int[size];
        intList = new Integer[size];

        System.out.println("\nEnter the numbers...");

        for (int i = 0; i < size; i++) {
            intList[i] = scan.nextInt();
        }

        // Sorting.selectionSort(intList);
        Sorting.insertionSort(intList);

        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.println(intList[i] + " ");
        }
        System.out.println();
    }
}
