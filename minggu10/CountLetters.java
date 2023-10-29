package minggu10;

// ****************************************************************
// CountLetters.java
//
// Reads a words from the standard input and prints the number of
// occurrences of each letter in that word.
//
// ****************************************************************
import java.util.Scanner;

public class CountLetters {
    public static void main(String[] args) {
        int[] counts = new int[26];
        try (Scanner scan = new Scanner(System.in)) {
            // Get word from the user
            System.out.print("Enter a single word (letters only, please): ");
            String word = scan.nextLine();

            // Convert to all upper case
            word = word.toUpperCase();

            // Count frequency of each letter in the string
            for (int i = 0; i < word.length(); i++) {
                char currentChar = word.charAt(i);
                try {
                    counts[currentChar - 'A']++;
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Not a letter: " + currentChar);
                }
            }
        }

        // Print frequencies
        System.out.println();
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] != 0) {
                System.out.println((char) (i + 'A') + ": " + counts[i]);
            }
        }
    }
}
