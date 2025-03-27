/*
 * INSTRUCTIONS:
 * 	This is the starting Java code for hw3_1.
 * 	Note that the current filename is "Main.java".
 * 	When you finish your development, copy the file.
 * 	Then, rename the copied file to "Main_hw3_1.java".
 * 	After that, upload the renamed file to Canvas.
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
         boolean firstNum = true;
         String time1 = getTime();
         convertToSeconds(time1, firstNum);
         String time2 = getTime();
         convertToSeconds(time2, firstNum);
 
 
     }
 
     public static String getTime(){
         Scanner scanner = new Scanner(System.in);
         System.out.println("Enter input time: ");
         String input = scanner.nextLine();
         return input;
     }
 
     public static void convertToSeconds(String input, boolean firstNum){
         
         // Split the input time with the : symbol.
         String[] inputTime = input.split(":");
         // Extract the hour, minute, second, and am/pm from input.
         int hour = Integer.parseInt(inputTime[0]);
         int minute = Integer.parseInt(inputTime[1]);
         int second = Integer.parseInt(inputTime[2]);
         String ampm = inputTime[3];
 
         System.out.println("hours = " + hour );
         System.out.println("minutes = " + minute );
         System.out.println("seconds = " + second );
         System.out.println("AM or PM? " + ampm);
 
         if (firstNum) {
             int total_seconds = 0;
             total_seconds += second;
             total_seconds += minute * 60;
             if (ampm == "AM") {
                 hour += 24;
             }
             total_seconds += (hour * 60) * 60;
             System.out.println(total_seconds);
         } else {
             int total_seconds = 0;
             total_seconds += second;
             total_seconds += minute * 60;
             total_seconds += (hour * 60) * 60;
             System.out.println(total_seconds);
         }
         
     }
 
     public static int findTime(String time1, String time2){
         
         // Integer.parseInt()
         return 0;
     }
 } 
 