// A sample program to conduct the breadth first search (BFS) in Java.
// Written by EIR and Dr. Byun for CST370.

// Input graph format:
//   - Number of vertices
//   - Number of edges
//   - Each edge info with a starting and an ending vertices.
// First Example
/* 
3 
2
0 1
1 2
*/

// Second example
/* 
5
4
0 1
0 2
2 3
3 4
*/

// Third example
/* 
5
10
0 1
1 0
0 4
4 0
1 4
4 1
1 2
2 1
2 4
4 2
*/

/*
 * INSTRUCTIONS:
 *     This is the starting Java code for hw5_1.
 *     Note that the current filename is "Main.java". 
 *     When you finish your development, copy the file.
 *     Then, rename the copied file to "Main_hw5_1.java".
 *     After that, upload the renamed file to Canvas.
 */

// Finish the head comment with Abstract, ID, Name, and Date.
/*
 * Title: Main_hw5_2.java
 * Abstract: This program simulates a dfs algorithm where we read in input and output the traversal of the graph
 * ID: 1249
 * Name: Jacob Bello
 * Date: 03/13/25
 */

import java.util.*;

class Main_hw5_2 {
    
    static void read_graph(ArrayList<ArrayList<Integer>> g) {
        Scanner kb = new Scanner(System.in);
        
        int num_of_vertices = kb.nextInt();
        for (int i = 0; i < num_of_vertices; i++) {
            g.add(new ArrayList<>());
        }
        
        int num_of_edges = kb.nextInt();
        
        for (int i = 0; i < num_of_edges; i++) {
            int from = kb.nextInt();
            int to = kb.nextInt();
            g.get(from).add(to);
        }

        // Sort adjacency lists for consistent traversal order
        for (int i = 0; i < num_of_vertices; i++) {
            Collections.sort(g.get(i));
        }
    }

    
    // static void printGraph(ArrayList<ArrayList<Integer>> g) {
    //     for (int i = 0; i < g.size(); i++) {
    //         System.out.print(i);
    //         for (int j = 0; j < g.get(i).size(); j++) {
    //             System.out.print(" -> " + g.get(i).get(j));
    //         }
    //         System.out.println(); 
    //     } 
    // }


    static void dfs(ArrayList<ArrayList<Integer>> g, int src, ArrayList<Integer> mark, int[] counter) {
        mark.set(src, counter[0]++);  // assign visit order
        
        for (int neighbor : g.get(src)) {
            if (mark.get(neighbor) == 0) {
                dfs(g, neighbor, mark, counter);
            }
        }
    }
    
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        read_graph(graph);

        ArrayList<Integer> mark = new ArrayList<>(Collections.nCopies(graph.size(), 0));
        int[] counter = {1}; // use array to track visit order

        // disconnected graphs
        for (int i = 0; i < graph.size(); i++) {
            if (mark.get(i) == 0) {
                dfs(graph, i, mark, counter);
            }
        }

        // print output
        for (int i = 0; i < mark.size(); i++) {
            System.out.println("Mark[" + i + "]:" + mark.get(i));
        }
    }
}




