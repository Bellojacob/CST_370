/*
 * INSTRUCTIONS:
 *     This is the starting Java code for hw2_2.
 *     Note that the current filename is "Main.java". 
 *     When you finish your development, copy the file.
 *     Then, rename the copied file to "Main_hw2_2.java".
 *     After that, upload the renamed file to Canvas.
 */

// Finish the head comment with Abstract, ID, Name, and Date.
/*
 * Title: Main.java
 * Abstract: Write the main purpose of the program.
 * ID: Write your 4-digit ID
 * Name: Write your name
 * Date: MM/DD/YYYY
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        input = input.toUpperCase();
        input = input.replaceAll("[^a-zA-Z0-9]", "");
        ArrayList<Character> chars = new ArrayList<>();
        for (char c : input.toCharArray()) {
            chars.add(c);
        }
        
        
        // System.out.println("you entered: " + input);
        // for (Character c : chars) {
        //     System.out.print(c + " ");
        // }
        
        int length = chars.size();

        int middle = length/2;

        boolean isValid = true;
        char badCharacter = 'a';

        for(int i = 0; i < middle; i++){
            if (chars.get(i).equals(chars.get(length - 1 - i))) {
                isValid = true;
            } else {
                isValid = false;
                badCharacter = chars.get(i);
                break;
            }
        }

        if (isValid) {
            System.out.println("PALINDROME");
        } else{
            System.out.println("NO:" + badCharacter);
            
        }

    }
}

