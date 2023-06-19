package com.fabiocarlesso.util;

import java.util.LinkedList;

public class Search {
    protected int vertices;
    protected LinkedList<Integer>[] adjList;

    public Search(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjList[source].add(destination);
    }
}
