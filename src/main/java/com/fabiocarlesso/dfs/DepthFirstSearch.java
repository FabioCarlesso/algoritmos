package com.fabiocarlesso.dfs;

import com.fabiocarlesso.util.Search;

import java.util.LinkedList;

public class DepthFirstSearch extends Search{

    public DepthFirstSearch(int vertices) {
        super(vertices);
    }

    public void depthFirstSearch(int startVertex) {
        boolean[] visited = new boolean[vertices];
        dfsUtil(startVertex, visited);
    }

    private void dfsUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        LinkedList<Integer> neighbors = adjList[vertex];
        for (int neighbor : neighbors) {
            if (!visited[neighbor]) {
                dfsUtil(neighbor, visited);
            }
        }
    }
}
