package com.fabiocarlesso.decisiontree;

import java.util.HashMap;
import java.util.Map;

public class Node {
    private String attribute;
    private Map<String, Node> children;
    private String decision;

    public Node(String attribute) {
        this.attribute = attribute;
        this.children = new HashMap<>();
        this.decision = null;
    }

    public void addChild(String value, Node child) {
        children.put(value, child);
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getDecision() {
        return decision;
    }

    public Node getChild(String value) {
        return children.get(value);
    }

    public String getAttribute() {
        return attribute;
    }
}
