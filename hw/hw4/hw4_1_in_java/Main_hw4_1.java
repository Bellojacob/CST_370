/*
 * INSTRUCTIONS:
 *     This is the starting Java code for hw4_1.
 *     Note that the current filename is "Main.java". 
 *     When you finish your development, copy the file.
 *     Then, rename the copied file to "Main_hw4_1.java".
 *     After that, upload the renamed file to Canvas.
 */

// Finish the head comment with Abstract, ID, Name, and Date.
/*
 * Title: Main.java
 * Abstract: This program takes two strings and checks if they're anagrams, if yes then print anagram and return the list and frequency
 * of every letter from both strings, in no then print no anagram
 * ID: 1249
 * Name: Jacob Bello
 * Date: 03/05/2025
 */

import java.util.Scanner;
import java.util.Arrays;
import java.util.TreeMap;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // System.out.print("Enter first word: ");
        String word1 = scanner.nextLine().replaceAll("\\s+", "").toUpperCase();
        
        // System.out.print("Enter second word: ");
        String word2 = scanner.nextLine().replaceAll("\\s+", "").toUpperCase();
        
        scanner.close(); // Closing scanner after input collection

        char[] word1Array = word1.toCharArray();
        char[] word2Array = word2.toCharArray();

        Arrays.sort(word1Array);
        Arrays.sort(word2Array);

        // System.out.println("CHAR 1 Array: " + Arrays.toString(word1Array));
        // System.out.println("CHAR 2 Array: " + Arrays.toString(word2Array));

        if (Arrays.equals(word1Array, word2Array)) {
            TreeMap<Character, Integer> frequency = new TreeMap<>(); // TreeMap maintains sorted order
            
            // Loop through word1Array and update the frequency map
            for (char c : word1Array) {
                frequency.put(c, frequency.getOrDefault(c, 0) + 1);
            }

            System.out.println("ANAGRAM");
            // Print the sorted character frequencies
            for (Character i : frequency.keySet()) {
                System.out.println(i + ":" + frequency.get(i));
            }
        } else {
            System.out.println("NO ANAGRAM");
        }
    }
}
