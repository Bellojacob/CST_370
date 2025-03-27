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

import java.util.*;

class Main {
    
    static void read_graph(ArrayList<ArrayList<Integer>> g) {
        Scanner kb = new Scanner(System.in);
        
        int num_of_vertices = kb.nextInt();
        for (int i=0; i < num_of_vertices; i++) {
            g.add(new ArrayList<Integer>());
        }
        
        int num_of_edges = kb.nextInt();
        
        int from;
        int to;
        for (int i=0; i < num_of_edges; i++) {
            from = kb.nextInt();
            to = kb.nextInt();
            g.get(from).add(to);
        }

        // Sort the ArrayList elements to follow our alphabetical convention.
        for (int i=0; i < num_of_vertices; i++) {
            Collections.sort(g.get(i));
        }
    }

    
    static void printGraph(ArrayList<ArrayList<Integer>> g) {
        for (int i = 0; i < g.size(); i++) {
            System.out.print(i);
            for (int j = 0; j < g.get(i).size(); j++) {
                System.out.print(" -> " + g.get(i).get(j));
            }
            System.out.println(); 
        } 
    }


    static void bfs(ArrayList<ArrayList<Integer>> g, int src) {
        Queue<Integer> q = new LinkedList<>();
        int count = 0;
        ArrayList<Integer> mark = new ArrayList<>(g.size());
        for (int i =0; i < g.size(); i++) {
            mark.add(0);
        }
        
        mark.set(src, ++count);
        q.add(src);
        
        while (!q.isEmpty()) {
            int curr = q.peek();
            q.remove();
            System.out.println("visiting: " + curr); 
            
            for (int i = 0; i < g.get(curr).size(); i++) {
                int neighbor = g.get(curr).get(i);
                if (mark.get(neighbor) == 0) {
                    mark.set(neighbor, ++count);
                    q.add(neighbor);
                }
            }
        }

        System.out.println("\n==== Mark Array ==== "); 
    	for (int i = 0; i < g.size(); i++) {
    		System.out.println("Mark[" + i + "]: " + mark.get(i));
    	}
    }
    
    
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        read_graph(graph);

        System.out.println("==== Printing Input Graph - Vertext By Vertex =====");
        printGraph(graph);

        int src = 0;
        System.out.println("\n==== BFS - Source Vertext: " + src + " =====");
        bfs(graph, src);

        return;
    }
}

