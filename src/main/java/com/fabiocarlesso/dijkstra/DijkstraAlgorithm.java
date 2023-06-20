package com.fabiocarlesso.dijkstra;

import java.util.*;

public class DijkstraAlgorithm {
    private final int vertices;
    private final List<List<Node>> adjList;

    public DijkstraAlgorithm(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(vertices);

        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adjList.get(source).add(new Node(destination, weight));
        adjList.get(destination).add(new Node(source, weight));
    }

    public void dijkstra(int startVertex) {
        int[] distances = new int[vertices];
        Arrays.fill(distances, Integer.MAX_VALUE);
        distances[startVertex] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(Node::getWeight));
        pq.add(new Node(startVertex, 0));

        while (!pq.isEmpty()) {
            int currentVertex = pq.poll().getVertex();

            List<Node> neighbors = adjList.get(currentVertex);
            for (Node neighbor : neighbors) {
                int newDistance = distances[currentVertex] + neighbor.getWeight();
                if (newDistance < distances[neighbor.getVertex()]) {
                    distances[neighbor.getVertex()] = newDistance;
                    pq.add(new Node(neighbor.getVertex(), newDistance));
                }
            }
        }

        System.out.println("Distances from vertex " + startVertex + ":");
        for (int i = 0; i < vertices; i++) {
            System.out.println("Vertex " + i + ": " + distances[i]);
        }
    }
}
