/*
 * INSTRUCTIONS:
 *     This is the starting Java code for hw2_1.
 *     Note that the current filename is "Main.java". 
 *     When you finish your development, copy the file.
 *     Then, rename the copied file to "Main_hw2_1.java".
 *     After that, upload the renamed file to Canvas.
 */

// Finish the head comment with Abstract, ID, Name, and Date.
/*
 * Title: Main_hw2_1.java
 * Abstract: This program simulates a directed weighted graph into an adjacency list. The program
 *           takes in weighted graph data and then converts into into adjacency list format.
 * ID: 1249
 * Name: Jacob Bello
 * Date: 02/14/2025
 */

 import java.util.ArrayList;
 import java.util.Scanner;
 
 class Main {
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
 
         int vertices = scanner.nextInt();
         int edges = scanner.nextInt();
 
         
         if (vertices <= 0 || edges < 0) {
             System.out.println("Invalid graph.");
             return;
         }
 
         ArrayList<int[]>[] list = new ArrayList[vertices];
 
         
         for (int i = 0; i < vertices; i++) {
             list[i] = new ArrayList<>();
         }
 
         for (int i = 0; i < edges; i++) {
             int start = scanner.nextInt();
             int end = scanner.nextInt();
             int weight = scanner.nextInt();
 
             
             if (start < 0 || start >= vertices || end < 0 || end >= vertices) {
                 System.out.println("Invalid graph.");
                 return;
             }
 
             
             for (int[] edge : list[start]) {
                 if (edge[0] == end) {
                     System.out.println("Invalid graph.");
                     return;
                 }
             }
 
             list[start].add(new int[]{end, weight});
         }
 
         scanner.close();
 
         
         for (ArrayList<int[]> neighbors : list) {
             neighbors.sort((a, b) -> Integer.compare(a[0], b[0]));
         }
 
         
         for (int i = 0; i < vertices; i++) {
             System.out.print(i);
             if (!list[i].isEmpty()) {
                 for (int[] edge : list[i]) {
                     System.out.print("->" + edge[0] + "," + edge[1]);
                 }
             }
             System.out.println();
         }
     }
 }
 
