package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.dijkstra.DijkstraAlgorithm;

public class DijkstraMain {
    public static void dijkstraMain() {
        System.out.println("\n\n Dijkstra");
        int vertices = 6;
        DijkstraAlgorithm graph = new DijkstraAlgorithm(vertices);

        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 3);
        graph.addEdge(1, 3, 2);
        graph.addEdge(1, 2, 1);
        graph.addEdge(2, 3, 4);
        graph.addEdge(3, 4, 2);
        graph.addEdge(4, 5, 6);

        int startVertex = 0;
        graph.dijkstra(startVertex);
    }
}
