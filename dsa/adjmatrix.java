public class adjmatrix {
    class graphmatrix {
        int vertices;
        int[][] adjMatrix;

        graphmatrix(int v) {
            vertices = v;
            adjMatrix = new int[v][v];
        }

        void addEdge(int source, int destination) {
            adjMatrix[source][destination] = 1;
            adjMatrix[destination][source] = 1; // For undirected graph
        }
        public boolean hasEdge(int source, int destination) {
            return adjMatrix[source][destination] == 1;
        }

        void display() {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    System.out.print(adjMatrix[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        adjmatrix am = new adjmatrix();
        graphmatrix g = am.new graphmatrix(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);

        System.out.println("Adjacency Matrix:");
        g.display();

        System.out.println("Does an edge exist between 0 and 1? " + g.hasEdge(0, 1));
        System.out.println("Does an edge exist between 0 and 2? " + g.hasEdge(0, 2));
    }
    
}
