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
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

class Main 
 {
     public static void main(String[] args) 
     {
        // create arrays, A for group 1, B for group 2, then C for our final output
        ArrayList<Integer> groupA = new ArrayList<>();
        ArrayList<Integer> groupB = new ArrayList<>();
        ArrayList<Integer> groupC = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);

        // add first group of nums to array A
        int num1 = scanner.nextInt();
        for (int i = 0; i < num1; i++) {
            int num = scanner.nextInt();
            groupA.add(num);
        }

        // add second group of nums to array B
        int num2 = scanner.nextInt();
        for (int i = 0; i < num2; i++) {
            int num = scanner.nextInt();
            groupB.add(num);
        }

        // print out arrays to visualize our data
        // System.out.println("Group A");
        // for (Integer integer : groupA) {
        //     System.out.print(integer + " ");
        // }

        // System.out.println();

        // System.out.println("Group B");
        // for (Integer integer : groupB) {
        //     System.out.print(integer + " ");
        // }

        // now we need to compare and find non intersecting numbers or non duplicates
        // for the non duplicates, lets add them to array C

        for (int num : groupA) {
            if (!groupB.contains(num)) {
                groupC.add(num);
            }
        }

        // Find numbers in groupB but not in groupA
        for (int num : groupB) {
            if (!groupA.contains(num)) {
                groupC.add(num);
            }
        }

        Set<Integer> nums = new HashSet<>();

        for (int i : groupC) {
            nums.add(i);
        }

        groupC.clear();
        for (Integer integer : nums) {
            groupC.add(integer);
        }

        
        

        Collections.sort(groupC, Collections.reverseOrder());

        
        System.out.print("Answer:");
        // System.out.println("Group C");
        if (groupC.size() == 0) {
            System.out.println("NONE");
        } else {
            for (Integer integer : groupC) {
            System.out.print(integer + " ");
        }
        }
        

     
    }
}
 
 