package com.fabiocarlesso.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Graph {
    private final int numVertices;
    private final List<List<Integer>> adjacencyList;

    public Graph(int numVertices) {
        this.numVertices = numVertices;
        adjacencyList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjacencyList.add(new LinkedList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList.get(source).add(destination);
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + " is connected to: ");
            for (int edge : adjacencyList.get(i)) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }
}
