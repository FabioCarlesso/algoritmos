package com.fabiocarlesso.bfs;

import com.fabiocarlesso.util.Search;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch extends Search {

    public BreadthFirstSearch(int vertices) {
        super(vertices);
    }

    public void breadthFirstSearch(int startVertex) {
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            LinkedList<Integer> neighbors = adjList[currentVertex];
            for (int neighbor : neighbors) {
                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public boolean bfs(int[][] residualGraph, int source, int sink, int[] parent) {
        boolean[] visited = new boolean[vertices];
        Arrays.fill(visited, false);

        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited[source] = true;
        parent[source] = -1;

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();

            for (int nextVertex = 0; nextVertex < vertices; nextVertex++) {
                if (!visited[nextVertex] && residualGraph[currentVertex][nextVertex] > 0) {
                    queue.add(nextVertex);
                    parent[nextVertex] = currentVertex;
                    visited[nextVertex] = true;
                }
            }
        }

        return visited[sink];
    }

}
