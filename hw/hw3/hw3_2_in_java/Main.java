/*
 * INSTRUCTIONS:
 *     This is the starting Java code for hw3_2.
 *     Note that the current filename is "Main.java". 
 *     When you finish your development, copy the file.
 *     Then, rename the copied file to "Main_hw3_2.java".
 *     After that, upload the renamed file to Canvas.
 */

// Finish the head comment with Abstract, ID, Name, and Date.
/*
 * Title: Main.java
 * Abstract: This program takes in a number with a set of characters or strings, it computes all the possible combinations
 *          and then displays the possible combos, with a binary representation, and certain items from the set according
 *          to the binary representation.
 * ID: 1249
 * Name: Jacob Bello
 * Date: 02/20/2025
 */

import java.util.ArrayList;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> set = takeInput(scanner);
        logic(set);
    }

    public static ArrayList<String> takeInput(Scanner scanner) {
        ArrayList<String> set = new ArrayList<>();
    
        if (scanner.hasNextInt()) {
            int numOfInputInSet = scanner.nextInt();
            scanner.nextLine(); // this fixes our scanner issue
    
            if (numOfInputInSet <= 0) { // if num == 0 then just return
                return set;
            }
    
            // check if there is a next line and then input it
            if (scanner.hasNextLine()) {
                String inputLine = scanner.nextLine();
                String[] elements = inputLine.split("\\s+"); // split by whitespace
    
                // make sure we add the right amount of elements
                for (int i = 0; i < Math.min(numOfInputInSet, elements.length); i++) {
                    set.add(elements[i]);
                }
            }
        }
        return set;
    }
    
    
        

    // actual logic for the program
    public static void logic(ArrayList<String> set) {
        if (set.isEmpty()) {
            // if the set is empty, then return this empty string
            System.out.println("0:0:EMPTY");
            return;
        }

        int size = set.size();
        // find amount of possible combos
        double possibleCombos = Math.pow(2, size);
        // cast as int bc it was a double
        int result = ((int) possibleCombos);
    
        for (int i = 0; i < result; i++) {
            
            // use string format to pad correctly
            String binaryString = String.format("%" + size + "s", decToBinary(i)).replace(' ', '0');
    
            System.out.print(i + ":");
            System.out.print(binaryString);
            System.out.print(":");

            // add binary to array, check if it is a 1, if it is then find the corresponding element in the array to print
            char[] binaryArray = binaryString.toCharArray();
            boolean isEmpty = true;

            for (int k = 0; k < binaryArray.length; k++) {
                if (binaryArray[k] == '1') {
                    System.out.print(set.get(k) + " ");
                    isEmpty = false;
                }
            }

            if (isEmpty) {
                System.out.print("EMPTY");
            }

            System.out.println();
        }
    }
            

    // take an int decimal num and return a string binary num
    // taken from https://www.geeksforgeeks.org/program-decimal-binary-conversion/
    static String decToBinary(int n) {
        if (n == 0) {
            return "0";
        }
        
        StringBuilder bin = new StringBuilder();
        while (n > 0) {
            int bit = n % 2;
            bin.append((char) ('0' + bit));
            n /= 2;
        }
        
        bin.reverse();
        return bin.toString();
    }

    
}

