package Graph;
import java.util.*;

public class BFS {
    public static List<Integer> bfsTraversal(int vertex, List<List<Integer>> edges) {
        Map<Integer, List<Integer>> adjList = new HashMap<>();
        List<Integer> ans = new ArrayList<>();
        Map<Integer, Boolean> visited = new HashMap<>();

        // Initialize all vertices as not visited
        for (int i = 0; i < vertex; i++) {
            visited.put(i, false);
        }

        // Prepare the adjacency list and sort the neighbors
        prepareAdjList(adjList, edges);

        // Traverse all components of the graph
        for (int i = 0; i < vertex; i++) {
            if (!visited.get(i)) {
                bfs(adjList, visited, ans, i);
            }
        }

        return ans;
    }

    public static void bfs(Map<Integer, List<Integer>> adjList, Map<Integer, Boolean> visited, List<Integer> ans, int node) {
        Queue<Integer> q = new LinkedList<>();
        q.add(node);
        visited.put(node, true);

        while (!q.isEmpty()) {
            int frontNode = q.poll();

            // Store frontNode into ans
            ans.add(frontNode);

            // Traverse all neighbours of frontNode
            for (Integer neighbor : adjList.getOrDefault(frontNode, new ArrayList<>())) {
                if (!visited.get(neighbor)) {
                    q.add(neighbor);
                    visited.put(neighbor, true);
                }
            }
        }
    }

    public static void prepareAdjList(Map<Integer, List<Integer>> adjList, List<List<Integer>> edges) {
        for (List<Integer> edge : edges) {
            // Ensure the edge contains exactly two vertices
            if (edge.size() < 2) {
                continue; // Skip this edge if it is not properly formed
            }

            int u = edge.get(0);
            int v = edge.get(1);

            adjList.putIfAbsent(u, new ArrayList<>());
            adjList.putIfAbsent(v, new ArrayList<>());

            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        // Sort the adjacency list to ensure consistent traversal order
        for (Map.Entry<Integer, List<Integer>> entry : adjList.entrySet()) {
            Collections.sort(entry.getValue());
        }
    }
}
