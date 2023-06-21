package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.graph.Graph;

public class GraphMain {
    private GraphMain() {
        throw new IllegalStateException("Utility class");
    }
    public static void graphMain(){
        System.out.println("\n\nGraph");
        int numVertices = 5;
        Graph graph = new Graph(numVertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}
