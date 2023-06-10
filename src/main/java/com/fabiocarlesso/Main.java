package com.fabiocarlesso;

import com.fabiocarlesso.binarytree.BinaryTree;
import com.fabiocarlesso.graph.Graph;

public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal (antes da inversão):");
        tree.printInorder();

        tree.invert();

        System.out.println("\nInorder traversal (após a inversão):");
        tree.printInorder();

        int numVertices = 5;
        Graph graph = new Graph(numVertices);

        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        System.out.println("\n\nGraph:");
        graph.printGraph();
    }
}