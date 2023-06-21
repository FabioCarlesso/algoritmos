package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.dfs.DepthFirstSearch;

public class DepthFirstSearchMain {
    private DepthFirstSearchMain() {
        throw new IllegalStateException("Utility class");
    }
    public static void depthFirstSearchMain() {
        System.out.println("\n\n Depth First Search (BFS)");
        DepthFirstSearch graph = new DepthFirstSearch(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);

        System.out.println("DFS Traversal (starting from vertex 0):");
        graph.depthFirstSearch(0);
    }
}
