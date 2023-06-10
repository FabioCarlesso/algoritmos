package com.fabiocarlesso.binarytree;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void insert(int data) {
        root = insertNode(root, data);
    }

    private Node insertNode(Node currentNode, int data) {
        if (currentNode == null) {
            return new Node(data);
        } else {
            if (data <= currentNode.data) {
                currentNode.left = insertNode(currentNode.left, data);
            } else {
                currentNode.right = insertNode(currentNode.right, data);
            }
        }
        return currentNode;
    }

    public void printInorder() {
        inorderTraversal(root);
    }

    private void inorderTraversal(Node currentNode) {
        if (currentNode != null) {
            inorderTraversal(currentNode.left);
            System.out.print(currentNode.data + " ");
            inorderTraversal(currentNode.right);
        }
    }

    public void invert() {
        invertTree(root);
    }

    private void invertTree(Node currentNode) {
        if (currentNode == null) {
            return;
        }

        // Troca os filhos esquerdo e direito
        Node temp = currentNode.left;
        currentNode.left = currentNode.right;
        currentNode.right = temp;

        // Recursivamente inverte os filhos esquerdo e direito
        invertTree(currentNode.left);
        invertTree(currentNode.right);
    }
}
