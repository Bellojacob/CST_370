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
import java.util.Collections;
import java.util.Scanner;

class Main_attempt1 
{
    public static void main(String[] args) 
    {
        // Develop your program here.
        // The following is just a sample statement.
        // System.out.println("ENTER NUMBERS: ");

        ArrayList<Integer> groupA = new ArrayList<>();
        ArrayList<Integer> groupB = new ArrayList<>();
        ArrayList<Integer> groupC = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        int groupAFirstNum = scanner.nextInt();

        for(int i = 0; i < groupAFirstNum; i++){
            groupA.add(scanner.nextInt());
        }

        int groupBFirstNum = scanner.nextInt();
        for(int i = 0; i < groupBFirstNum; i++){
            groupB.add(scanner.nextInt());
        }



        // System.out.println("Group A\n" + groupA);
        // System.out.println("Group B\n" + groupB);


        //check if group a and group b have intersecting nums

        // loop through group A
        for (int i = 0; i < groupA.size(); i++){
            // set flag for is unique number
            boolean isUnique = true;
            // loop through group b
            for (int k = 0; k < groupB.size(); k++){
                // if group a num == group b num, then is unique is false, and break the loop and check next num
                if (groupA.get(i) == groupB.get(k)) {
                    isUnique = false;
                    break;
                }
            }
            // if we passed through w/o equaling any nums, then it is unique and lets add this to group C
            if (isUnique) {
                groupC.add(groupA.get(i));
            }
        }

        // now we check group A against group B for unique nums, and lets check group B against group A

        // lets loop through group B
        for (int i = 0; i < groupB.size(); i++) {
            // set is unique flag to true
            boolean isUnique = true;
            // lets loop through group A
            for (int k = 0; k < groupA.size(); k++){
                // lets check if group B num == group A num
                if (groupB.get(i) == groupA.get(k)) {
                    // if we found a match then it is not a unique num, lets break the loop
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                // if nothing matched, then it is unique, but we need to check if it is already in group C, the unique nums from the first check
                // lets loop through group C and check
                for (int j = 0; j < groupC.size(); j++){
                    if (groupB.get(i) == groupC.get(j)) {
                        isUnique = false;
                        break;
                    }
                    
                }
                // if we pass these checks we can assume it is unique and add it
                groupC.add(groupB.get(i));
            }
        }

        // remove duplicates if any
        ArrayList<Integer> uniqueList = new ArrayList<>();

        for (Integer i : groupC){
            if (!uniqueList.contains(i)) {
                uniqueList.add(i);
            }
        }

        groupC = uniqueList;

        Collections.sort(groupC, Collections.reverseOrder());

        System.out.print("Answer:");
        if (groupC.size() == 0) {
            System.out.print("NONE");
        }
        for (int i : groupC) {
            System.out.print(i + " ");
        }
        
        

    }

    

    
    

    


}

