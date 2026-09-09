import java.util.*;
public class adjlist {
    class graphlist {
        private List<List<Integer>> adj;
        private int V;

        graphlist(int v) {
           this.V = v;
            adj = new ArrayList<>(v);
            for (int i = 0; i < v; i++) {
                adj.add(new ArrayList<>());
            }
        }

        public void addEdge(int source, int destination) {
            adj.get(source).add(destination);
            adj.get(destination).add(source); // For undirected graph
        }
        public List<Integer> addEdges(int u, int v) {
            return adj.get(u);
        }

        public void display() {
            for (int i = 0; i < V; i++) {
                System.out.print("Vertex " + i + ": ");
                for (int j : adj.get(i)) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        adjlist al = new adjlist();
        graphlist g = al.new graphlist(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Adjacency List:");
        g.display();
    }
}
