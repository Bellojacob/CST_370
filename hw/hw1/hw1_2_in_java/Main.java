/*
 * INSTRUCTIONS:
 *     This is the starting Java code for hw1_2.
 *     Note that the current filename is "Main.java". 
 *     When you finish your development, copy the file.
 *     Then, rename the copied file to "Main_hw1_2.java".
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
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        // Develop your program here.
        
        HashMap<Integer, Integer> frequentNumbers = new HashMap<>();

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();

        for (int i = 0; i < size; i++){
            int temp = scanner.nextInt();
            if (frequentNumbers.containsKey(temp)){
                frequentNumbers.put(temp, frequentNumbers.get(temp) + 1);
            } else {
            
            frequentNumbers.put(temp, 1);
            }
        }

        // for (int i : frequentNumbers.keySet()){
        //     System.out.println(i + " - " + frequentNumbers.get(i) );
        // }

        // look for greatest value frequency
        ArrayList<Integer> greatestFreq = new ArrayList<>();
        
        // Find the highest frequency
        int largestFrequency = 0;
        for (int i : frequentNumbers.keySet()) {
            if (frequentNumbers.get(i) > largestFrequency) {
                largestFrequency = frequentNumbers.get(i);
            }
        }

        // Find numbers that have the highest frequency
        for (int i : frequentNumbers.keySet()) {
            if (frequentNumbers.get(i) == largestFrequency) {
                greatestFreq.add(i);
            }
        }

        Collections.sort(greatestFreq);

        System.out.println("Frequency:" + largestFrequency);
        System.out.print("Number:");
        for (Integer i : greatestFreq) {
            System.out.print(i + " ");
        }
    }
}

