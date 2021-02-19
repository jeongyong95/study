package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * 인접리스트로 그래프 구현하기
 */
public class AdjacencyList {
    private List<Integer>[] graphList;

    public AdjacencyList(int n) {
        this.graphList = new ArrayList[n + 1];
        for (int i = 0; i < graphList.length; i++) {
            this.graphList[i] = new ArrayList<>();
        }
    }

    public void pushEdgeDirected(int out, int in) {
        this.graphList[out].add(in);
    }

    public void pushEdgeUndirected(int node1, int node2) {
        this.graphList[node1].add(node2);
        this.graphList[node2].add(node1);
    }

    public void printGraph() {
        for (int i = 1; i < graphList.length; i++) {
            for (Integer vertex : graphList[i]) {
                System.out.println(i + ", " + vertex);
            }
        }
    }
}