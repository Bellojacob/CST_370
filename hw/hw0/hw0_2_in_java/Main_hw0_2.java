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
        int[] numbers = new int[5];

        Scanner scanner = new Scanner(System.in);
        int num0 = scanner.nextInt();
        numbers[0] = num0;
        int num1 = scanner.nextInt();
        numbers[1] = num1;
        int num2 = scanner.nextInt();
        numbers[2] = num2;
        int num3 = scanner.nextInt();
        numbers[3] = num3;
        int num4 = scanner.nextInt();
        numbers[4] = num4;

        // for (int i : numbers) {
        //     System.out.println(i);
        // }

        // order elements
        for (int i =0; i < numbers.length - 1; i++){
            for (int k = i + 1; k < numbers.length; k++){
                if (numbers[i] > numbers[k]) {
                    int temp = numbers[k];
                    numbers[k] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }

        // find min element
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("MIN:"+min);

        //find max element
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("MAX:"+max);


        // find median
        int midElement = numbers.length/2;
        int median = numbers[midElement];
        System.out.println("MEDIAN:"+median);

        // System.out.println("Sorted: \n");
        // for (int i : numbers) {
        //     System.out.println(i);
        // }


        // Quick method but I feel like I'm probably not supposed to use Arraylist or Collection methods for this class
        // ArrayList<Integer> nums = new ArrayList<Integer>();
        // // just looked up you can add multiple elements to an arraylist at once using collections addAll instead
        // // of adding them one by one
        // Collections.addAll(nums, num1, num2, num3, num4, num5);
        // Collections.sort(nums);

        // int max = Collections.max(nums);
        // int min = Collections.min(nums);
        // int median = nums.get(2);

        // System.out.println("MIN:" + min);
        // System.out.println("MAX:" + max);
        // System.out.println("MEDIAN:" + median);
    }
}

