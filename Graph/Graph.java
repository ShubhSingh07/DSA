import java.util.ArrayList;

class Graph {
    int V;
    ArrayList<Integer>[] adjList;

    @SuppressWarnings("unchecked")
    Graph(int V) {
        this.V = V;
        adjList = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adjList[i] = new ArrayList<>();
        }
    }

    void addEdge(int u, int v) {
        adjList[u].add(v);
        adjList[v].add(u); // Undirected graph
    }

    void printAdjList() {
        for (int i = 0; i < V; i++) {
            System.out.print(i + " : ");
            for (int node : adjList[i]) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0, 1);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);

        g.printAdjList();
    }
}
