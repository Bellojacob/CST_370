/*
 * INSTRUCTIONS:
 *     This is the starting Java code for hw4_2.
 *     Note that the current filename is "Main.java". 
 *     When you finish your development, copy the file.
 *     Then, rename the copied file to "Main_hw4_2.java".
 *     After that, upload the renamed file to Canvas.
 */

// Finish the head comment with Abstract, ID, Name, and Date.
/*
 * Title: Main.java
 * Abstract: This program simulates a knapsack problem where we take in amount of items, sack capacity, a weight and value for each item,
 * then compute the best combination for the best value.
 * ID: 1249
 * Name: Jacob Bello
 * Date: 03/05/2025
 * Note: I used this as a source: https://www.w3schools.com/dsa/dsa_ref_knapsack.php
 */
import java.util.*;

public class Main {
    static int maxVal = 0;
    static int maxCapacity = 0;
    static List<List<Integer>> bestCombos = new ArrayList<>();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // read input
        int numOfItems = scanner.nextInt(); // number of items
        int capacity = scanner.nextInt(); // Knapsack capacity
        int[] weights = new int[numOfItems];
        int[] values = new int[numOfItems];
        
        for (int i = 0; i < numOfItems; i++) {
            weights[i] = scanner.nextInt();
            values[i] = scanner.nextInt();
        }
        
        // Generate all Combos and find the best one
        findBestCombo(numOfItems, capacity, weights, values);
        
        // Print the result
        printResult();
    }
    
    private static void findBestCombo(int numOfItems, int capacity, int[] weights, int[] values) {
        int totalCombos = 1 << numOfItems; // 2 ^numOfItems combos
        
        for (int i = 0; i < totalCombos; i++) {
            List<Integer> Combo = new ArrayList<>();

            int totalWeight = 0, totalValue = 0;
            
            for (int j = 0; j < numOfItems; j++) {
                if ((i & (1 << j)) > 0) { 

                    Combo.add(j + 1);
                    totalWeight += weights[j];
                    totalValue += values[j];
                }
            }
            
            if (totalWeight <= capacity) {
                if (totalValue > maxVal) {
                    maxVal = totalValue;
                    maxCapacity = totalWeight;

                    bestCombos.clear();
                    bestCombos.add(new ArrayList<>(Combo));

                } else if (totalValue == maxVal) {
                    bestCombos.add(new ArrayList<>(Combo));
                }
            }
        }
    }
    
    private static void printResult() {
        if (bestCombos.isEmpty()) {

            System.out.println("Item: No solution");
            return;
        }
        
        if (bestCombos.size() > 1) {
            System.out.println("Item: Multiple solutions");

        } else {
            Collections.sort(bestCombos.get(0));

            System.out.print("Item:");

            for (int item : bestCombos.get(0)) {
                System.out.print(" " + item);
            }
            System.out.println();
        }
        
        System.out.println("Capacity:" + maxCapacity);
        
        System.out.println("Value:" + maxVal);
    }
}