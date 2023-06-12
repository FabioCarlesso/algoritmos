package com.fabiocarlesso.decisiontree;

import java.util.Map;

public class DecisionTree {
    private Node root;

    public DecisionTree(Node root) {
        this.root = root;
    }

    public String classify(Map<String, String> instance) {
        Node current = root;

        while (current != null && current.getDecision() == null) {
            String attribute = current.getAttribute();
            String attributeValue = instance.get(attribute);
            current = current.getChild(attributeValue);
        }

        if (current != null) {
            return current.getDecision();
        }

        return null;
    }
}
