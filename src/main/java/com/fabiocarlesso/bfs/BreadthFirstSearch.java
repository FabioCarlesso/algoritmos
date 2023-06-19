package com.fabiocarlesso.bfs;

import com.fabiocarlesso.util.Search;

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
}
