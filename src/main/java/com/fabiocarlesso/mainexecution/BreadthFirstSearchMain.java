package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.bfs.BreadthFirstSearch;

public class BreadthFirstSearchMain {
    public static void breadthFirstSearchMain() {
        System.out.println("\n\n Breadth First Search (BFS)");
        BreadthFirstSearch graph = new BreadthFirstSearch(6);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(3, 5);

        System.out.println("BFS Traversal (starting from vertex 0):");
        graph.breadthFirstSearch(0);
    }
}
