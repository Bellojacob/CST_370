/*
 * INSTRUCTIONS:
 *     This is the starting Java code for hw0_2.
 *     Note that the current filename is "Main.java". 
 *     When you finish your development, copy the file.
 *     Then, rename the copied file to "Main_hw0_2.java".
 *     After that, upload the renamed file to Canvas.
 */

// Finish the head comment with Abstract, ID, Name, and Date.
/*
 * Title: Main.java
 * Abstract: This program will accept 5 ints and return the following values: Max, Min, and Median.
 * ID: 1249
 * Name: Jacob Bello
 * Date: 01/24/2025
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        // Develop your program here.
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        ArrayList<Integer> nums = new ArrayList<Integer>();
        // just looked up you can add multiple elements to an arraylist at once using collections addAll instead
        // of adding them one by one
        Collections.addAll(nums, num1, num2, num3, num4, num5);
        Collections.sort(nums);

        int max = Collections.max(nums);
        int min = Collections.min(nums);
        int median = nums.get(2);

        System.out.println("MIN:" + min);
        System.out.println("MAX:" + max);
        System.out.println("MEDIAN:" + median);
    }
}

