package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.binarytree.BinaryTree;

public class BinaryTreeMain {
    public static void binaryTreeMain(){
        System.out.println("\n\nBinaryTree");
        BinaryTree tree = new BinaryTree();

        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder traversal:");
        tree.printInorder();
    }
}
