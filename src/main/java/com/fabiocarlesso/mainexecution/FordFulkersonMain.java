package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.fordfulkerson.FordFulkersonAlgorithm;

public class FordFulkersonMain {
    private FordFulkersonMain() {
        throw new IllegalStateException("Utility class");
    }
    public static void fordFulkersonMain() {
        System.out.println("\n\n Ford Fulkerson");
        int vertices = 6;
        FordFulkersonAlgorithm graph = new FordFulkersonAlgorithm(vertices);

        int[][] capacityGraph = {
                {0, 16, 13, 0, 0, 0},
                {0, 0, 10, 12, 0, 0},
                {0, 4, 0, 0, 14, 0},
                {0, 0, 9, 0, 0, 20},
                {0, 0, 0, 7, 0, 4},
                {0, 0, 0, 0, 0, 0}
        };

        int source = 0;
        int sink = 5;

        int maxFlow = graph.fordFulkerson(capacityGraph, source, sink);
        System.out.println("Max Flow: " + maxFlow);
    }
}
