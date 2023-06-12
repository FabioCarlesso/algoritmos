package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.decisiontree.DecisionTree;
import com.fabiocarlesso.decisiontree.Node;

import java.util.HashMap;
import java.util.Map;

public class DecisionTreeMain {
    public static void decisionTreeMain(){
        System.out.println("\n\nDecision Tree");
        // Construir a árvore de decisão manualmente
        Node root = new Node("petal_length");

        // Definir os nós da árvore manualmente
        Node node1 = new Node("petal_width");
        Node node2 = new Node("Iris-setosa");
        Node node3 = new Node("Iris-versicolor");

        root.addChild("<=2.45", node1);
        node1.addChild("<=1.75", node2);
        node1.addChild(">1.75", node3);

        node2.setDecision("Iris-setosa");
        node3.setDecision("Iris-versicolor");

        // Criar uma instância da árvore de decisão
        DecisionTree decisionTree = new DecisionTree(root);

        // Construir uma instância de teste
        Map<String, String> instance = new HashMap<>();
        instance.put("petal_length", "4.9");
        instance.put("petal_width", "1.8");

        // Classificar a instância usando a árvore de decisão
        String decision = decisionTree.classify(instance);

        // Imprimir a decisão
        System.out.println("A flor é classificada como: " + decision);
    }
}
