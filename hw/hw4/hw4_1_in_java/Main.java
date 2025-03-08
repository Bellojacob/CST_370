/*
 * Title: Main.java
 * Abstract: This program determines if two input words are anagrams. 
 *           It removes extra spaces, converts words to uppercase, sorts their characters, 
 *           and compares the sorted versions to check for anagram status.
 * ID: [Your 4-digit ID]
 * Name: [Your Name]
 * Date: MM/DD/YYYY
 */

 import java.util.Scanner;
 import java.util.Arrays;
 
 class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         
         System.out.print("Enter first word: ");
         String word1 = scanner.nextLine().strip().toUpperCase();
         
         System.out.print("Enter second word: ");
         String word2 = scanner.nextLine().strip().toUpperCase();
         
         scanner.close(); // Closing scanner after input collection
 
         char[] word1Array = word1.toCharArray();
         char[] word2Array = word2.toCharArray();
         
         Arrays.sort(word1Array);
         Arrays.sort(word2Array);
         
         if (Arrays.equals(word1Array, word2Array)) {
             System.out.println("ANAGRAM");
         } else {
             System.out.println("NOT AN ANAGRAM");
         }
     }
 }
 