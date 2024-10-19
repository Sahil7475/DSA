package Graph;
import java.util.*;


public class CreatingandPrintinggraph {
    public static int[][] printAdjacency(int n, int m, int[][] edges) {
        // Create an array of ArrayLists to store adjacency list
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        // Initialize each list in the ArrayList
        for (int i = 0; i < n; i++) {
            ans.add(new ArrayList<>());
        }

        // Add edges to the adjacency list
        for (int i = 0; i < m; i++) {
            int u = edges[i][0]; // Get u from edges
            int v = edges[i][1]; // Get v from edges

            ans.get(u).add(v); // Add v to u's list
            ans.get(v).add(u); // Add u to v's list (undirected graph)
        }

        // Create the final 2D array to store the adjacency matrix
        int[][] adj = new int[n][];

        for (int i = 0; i < n; i++) {
            // Include the node itself in the adjacency list
            ArrayList<Integer> current = new ArrayList<>();
            current.add(i);

            // Add all neighbors of the node
            current.addAll(ans.get(i));

            // Convert the ArrayList to an array
            adj[i] = new int[current.size()];
            for (int j = 0; j < current.size(); j++) {
                adj[i][j] = current.get(j);
            }
        }

        return adj; // Return the adjacency matrix
    }
}
