/*
 * INSTRUCTIONS:
 *     This is the starting Java code for hw1_1.
 *     Note that the current filename is "Main.java". 
 *     When you finish your development, copy the file.
 *     Then, rename the copied file to "Main_hw1_1.java".
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

import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        // Develop your program here.
        // The following is just a sample statement.
        System.out.println("ENTER NUMBERS: ");

        int[] group_a = addGroup();
        int[] group_b = addGroup();



        System.out.println("Group A");
        print(group_a);
        System.out.println("\nGroup B");
        print(group_b);

        

    }

    public static int[] addGroup(){
        Scanner scanner = new Scanner(System.in);

        int groupAmount = scanner.nextInt();
        System.out.println("total group amount equals " + groupAmount);
        int[] group = new int[groupAmount];

        for (int i = 0; i < groupAmount; i++){
            group[i] = scanner.nextInt();
        }

        return group;
    }

    public static void print(int[] a){
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
    

    


}

