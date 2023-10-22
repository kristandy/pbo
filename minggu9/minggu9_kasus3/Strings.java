package minggu9_kasus3;

import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Comparable[] stringList;
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.println("\nHow many strings do you want to sort?");
        size = scan.nextInt();
        scan.nextLine(); 

        stringList = new String[size];

        System.out.println("\nEnter the strings...");
        for (int i = 0; i < size; i++) {
            stringList[i] = scan.nextLine();
        }

        // Sorting.selectionSort(stringList); 
        Sorting.insertionSort(stringList);

        System.out.println("\nYour strings in sorted order...");
        for (int i = 0; i < size; i++) {
            System.out.println(stringList[i]);
        }
        System.out.println();
    }
}
