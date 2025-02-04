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

import java.util.ArrayList;
import java.util.Scanner;

class Main 
{
    public static void main(String[] args) 
    {
        // Develop your program here.
        // The following is just a sample statement.
        System.out.println("ENTER NUMBERS: ");

        ArrayList<Integer> groupA = new ArrayList<>();
        ArrayList<Integer> groupB = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int groupAFirstNum = scanner.nextInt();

        for(int i = 0; i < groupAFirstNum; i++){
            groupA.add(scanner.nextInt());
        }

        int groupBFirstNum = scanner.nextInt();
        for(int i = 0; i < groupBFirstNum; i++){
            groupB.add(scanner.nextInt());
        }



        System.out.println("Group A\n" + groupA);
        System.out.println("Group B\n" + groupB);


        //check if group a and group b have intersecting nums

        for (int i = 0; i < groupA.size(); i++){
            if (groupA.get(i).equals(groupB.get(i))) {
                // if group a at i equals group b at 
            }
        }
        

    }

    

    
    

    


}

