/*
 * INSTRUCTIONS:
 *     This is the starting Java code for hw5_1.
 *     Note that the current filename is "Main.java". 
 *     When you finish your development, copy the file.
 *     Then, rename the copied file to "Main_hw5_1.java".
 *     After that, upload the renamed file to Canvas.
 */

// Finish the head comment with Abstract, ID, Name, and Date.
/*
 * Title: Main_hw5_1.java
 * Abstract: This program reads in input and output the input data in order but if numbers are consecutive then display them like this 51-53
 * ID: 1249
 * Name: Jacob Bello
 * Date: 03/12/25
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Main_hw5_1 
{
    public static void main(String[] args) 
    {
        // Develop your program here.
        // The following is just a sample statement.
        

        //read num of input, read input values, sort values, put in short representation for consec nums

        Scanner scanner = new Scanner(System.in);
        int numOfInput = scanner.nextInt();
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 0; i < numOfInput; i++) {
            int num = scanner.nextInt();
            nums.add(num);
        }

        Collections.sort(nums);

        StringBuilder sb = new StringBuilder();
        int i = 0;
        
        // while i is less than array size
        while (i < nums.size()) {
            // start = current element
            int start = nums.get(i);
            // out of bounds handling and if difference is 1 then it is consecutive
            while (i < nums.size() - 1 && nums.get(i + 1) - nums.get(i) == 1) {
                // loop to the next index until it is no longer consecutive
                i++;
            }
            // ending index where it is no longer consecutive
            int end = nums.get(i);


            if (start == end) {
                sb.append(start);
            } else {
                sb.append(start).append("-").append(end);
            }

            
            if (i < nums.size() - 1) {
                sb.append(" ");
            }

            // iterate to next index
            i++;
        }

        System.out.println(sb.toString());
        scanner.close();
    }
}
