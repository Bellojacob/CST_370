/*
 * INSTRUCTIONS:
 *     This is the starting Java code for hw0_1.
 *     Note that the current filename is "Main.java". 
 *     When you finish your development, copy the file.
 *     Then, rename the copied file to "Main_hw0_1.java".
 *     After that, upload the renamed file to Canvas.
 */

// Finish the head comment with Abstract, ID, Name, and Date.
/*
 * Title: Main.java
 * Abstract: This program accepts two numbers as input and returns the sum and the difference of the two numbers.
 * ID: 1249
 * Name: Jacob Bello
 * Date: 01/24/2025
 */

import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        // Develop your program here.
        // The following is just a sample statement.
        Scanner scanner = new Scanner(System.in);
        
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int diff = num1 - num2;
        System.out.println("SUM:"+ sum);
        System.out.println("DIFF:"+ diff);
    }
}

