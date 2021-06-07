package dataStructures.graph;

import java.util.List;

public class DepthFirstSearch {
    static AdjacencyList adj = new AdjacencyList(5);
    static boolean[] visited;
    static int[] searchArr;

    public static void main(String[] args) {
        adj.pushEdgeDirected(1, 3);
        adj.pushEdgeDirected(3, 4);
        adj.pushEdgeDirected(4, 2);
        adj.pushEdgeDirected(3, 5);

        searchArr = new int[5];
        visited = new boolean[5];
    }

    static void dfs(int start) {
        if (visited[start]) {
            return;
        }

        visited[start] = true;
        for (List<Integer> i : adj.getList()) {
            dfs(i.get(0));
        }

    }
}
