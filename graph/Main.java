package graph;

public class Main {
    public static void main(String[] args) {
        AdjacencyList graph = new AdjacencyList(5);
        graph.pushEdgeDirected(1, 3);
        graph.pushEdgeDirected(2, 4);
        graph.pushEdgeDirected(5, 1);
        graph.pushEdgeUndirected(2, 3);
        graph.printGraph();
    }
}
