package Graph;
import java.util.*;

public class IntroToGraph {

    HashMap<Integer,List<Integer>> adj = new HashMap<>();

    public void addEdge(int u,int v,boolean direction){
        // direction = false -> undirected
        // direction = true -> directed

        // create an edge from u to v
        adj.putIfAbsent(u,new ArrayList<>());
        adj.get(u).add(v);

        // if graph is undirected create edge from v to u also
        if(!direction){
            adj.putIfAbsent(v,new ArrayList<>());
            adj.get(v).add(u);
        }

    }

    public void printAdjList(){
        for(Map.Entry<Integer,List<Integer>> entry : adj.entrySet()){
            System.out.print(entry.getKey()+" -> ");
            for(int neighbour : entry.getValue()){
                System.out.print(neighbour+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of nodes:");
        int n=sc.nextInt();

        System.out.println("Enter number of edges:");
        int m = sc.nextInt();

        IntroToGraph g = new IntroToGraph();
        for(int i=0;i<m;i++){
            int u,v;
            u= sc.nextInt();
            v= sc.nextInt();

            g.addEdge(u,v,false);
        }

        g.printAdjList();

    }

}
