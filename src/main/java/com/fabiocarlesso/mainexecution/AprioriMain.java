package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.apriori.Apriori;
import com.fabiocarlesso.apriori.AprioriItemSet;

import java.util.*;

public class AprioriMain {
    public static void aprioriMain() {
        System.out.println("\n\n Apriori");

        //Exemplo de transações
        List<Set<String>> transactions = new ArrayList<>();
        transactions.add(new HashSet<>(Arrays.asList("A", "B", "C", "D")));
        transactions.add(new HashSet<>(Arrays.asList("A", "B", "C")));
        transactions.add(new HashSet<>(Arrays.asList("A", "B")));
        transactions.add(new HashSet<>(Arrays.asList("A", "B", "D")));
        transactions.add(new HashSet<>(Arrays.asList("B", "C", "D")));
        transactions.add(new HashSet<>(Arrays.asList("B", "C")));
        transactions.add(new HashSet<>(Arrays.asList("B", "D")));
        transactions.add(new HashSet<>(Arrays.asList("A", "C", "D")));

        double minSupport = 0.25;
        double minConfidence = 0.5;

        // Executar o algoritmo Apriori
        Apriori apriori = new Apriori(transactions, minSupport);
        Map<AprioriItemSet, Integer> frequentItemSets = apriori.findFrequentItemSets();

        // Gerar regras de associação
        apriori.generateAssociationRules(frequentItemSets, minConfidence);
    }
}
