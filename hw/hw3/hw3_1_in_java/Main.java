import java.util.Scanner;

/*
 * INSTRUCTIONS:
 *     This is the starting Java code for hw3_2.
 *     Note that the current filename is "Main.java". 
 *     When you finish your development, copy the file.
 *     Then, rename the copied file to "Main_hw3_1.java".
 *     After that, upload the renamed file to Canvas.
 */

// Finish the head comment with Abstract, ID, Name, and Date.
/*
 * Title: Main.java
 * Abstract: This program takes two times in 12 hour format and finds the difference in time between them.
 *           My approach is to convert the time to seconds, find the difference, then convert back into 12 hour format.
 * ID: 1249
 * Name: Jacob Bello
 * Date: 02/19/2025
 */

class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String time1 = getTime(scanner);
        String time2 = getTime(scanner);
        int timeInSeconds1 = convertToSeconds(time1);
        int timeInSeconds2 = convertToSeconds(time2);
 
        int difference = findDifference(timeInSeconds1, timeInSeconds2);
        System.out.println(convertTo12HrFormat(difference));
    }
 
    // get time and return as variable
    public static String getTime(Scanner scanner){
        return scanner.nextLine();
    }
 
    //  convert each time in seconds completely
    public static int convertToSeconds(String input){
        String[] inputTime = input.split(":");
        int hour = Integer.parseInt(inputTime[0]);
        int minute = Integer.parseInt(inputTime[1]);
        int second = Integer.parseInt(inputTime[2]);
        String ampm = inputTime[3];

        // convert 12-hour format to 24-hour format
        if (ampm.equals("PM") && hour != 12) { 
            hour += 12;
        } 
        if (ampm.equals("AM") && hour == 12) { 
            hour = 0;
        }

        return (hour * 3600) + (minute * 60) + second;
    }
 
    public static int findDifference(int time1, int time2){
        if (time2 < time1) { 
            time2 += 86400; // if the time rolls into the next day, add 24 hours to handle this case
        }

        if (time1 == time2) {
            return 86400; // if the times are equal, they must be 24 hours apart according to the doc
        }

        int diff = time2 - time1;

        return diff; // return the diff
    }

    public static String convertTo12HrFormat(int timeInSeconds){
        int hours = timeInSeconds / 3600;
        int leftover = timeInSeconds % 3600;
        int minutes = leftover / 60; 
        int seconds = leftover % 60;
        // convert it all back to 12 hr format

        

        if (hours == 0) { 
            hours = 12;
        }

        // format nicely so we pass test cases
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }
}
