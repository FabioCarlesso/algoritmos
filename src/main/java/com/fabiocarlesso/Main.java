package com.fabiocarlesso;

import com.fabiocarlesso.binarytree.BinaryTree;

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
    }
}