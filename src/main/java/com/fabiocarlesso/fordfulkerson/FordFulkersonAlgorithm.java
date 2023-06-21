package com.fabiocarlesso.fordfulkerson;

import com.fabiocarlesso.bfs.BreadthFirstSearch;

public class FordFulkersonAlgorithm {
    private final int vertices;

    public FordFulkersonAlgorithm(int vertices) {
        this.vertices = vertices;
    }



    public int fordFulkerson(int[][] graph, int source, int sink) {
        int[][] residualGraph = new int[vertices][vertices];

        for (int i = 0; i < vertices; i++) {
            System.arraycopy(graph[i], 0, residualGraph[i], 0, vertices);
        }

        int[] parent = new int[vertices];
        int maxFlow = 0;

        BreadthFirstSearch bfs = new BreadthFirstSearch(vertices);

        while (bfs.bfs(residualGraph, source, sink, parent)) {
            int pathFlow = Integer.MAX_VALUE;
            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                pathFlow = Math.min(pathFlow, residualGraph[u][v]);
            }

            for (int v = sink; v != source; v = parent[v]) {
                int u = parent[v];
                residualGraph[u][v] -= pathFlow;
                residualGraph[v][u] += pathFlow;
            }

            maxFlow += pathFlow;
        }

        return maxFlow;
    }
}
