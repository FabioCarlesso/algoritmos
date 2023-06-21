package com.fabiocarlesso.apriori;

import java.util.*;

public class Apriori {
    private final List<Set<String>> transactions;
    private final double minSupport;
    Map<AprioriItemSet, Integer> frequentItemSets = new HashMap<>();

    public Apriori(List<Set<String>> transactions, double minSupport) {
        this.transactions = transactions;
        this.minSupport = minSupport;
    }

    public Map<AprioriItemSet, Integer> findFrequentItemSets() {
        Map<AprioriItemSet, Integer> localFrequentItemSets = new HashMap<>();
        Map<String, Integer> itemCounts = countIndividualItems();
        Set<AprioriItemSet> frequentItemSetsK = getFrequent1ItemSets(localFrequentItemSets, itemCounts);
        while (!frequentItemSetsK.isEmpty()) {
            Set<AprioriItemSet> candidateItemSets = getCandidateItemSets(frequentItemSetsK);
            Map<AprioriItemSet, Integer> candidateSupportCounts = getCandidateSupportCounts(candidateItemSets);
            frequentItemSetsK = getFrequentItemSetsK(localFrequentItemSets, candidateSupportCounts);
        }
        this.frequentItemSets = localFrequentItemSets;
        return localFrequentItemSets;
    }

    private Set<AprioriItemSet> getFrequentItemSetsK(Map<AprioriItemSet, Integer> localFrequentItemSets, Map<AprioriItemSet, Integer> candidateSupportCounts) {
        Set<AprioriItemSet> frequentItemSetsK;
        frequentItemSetsK = new HashSet<>();
        for (Map.Entry<AprioriItemSet, Integer> entry : candidateSupportCounts.entrySet()) {
            AprioriItemSet itemSet = entry.getKey();
            int support = entry.getValue();
            double supportRatio = (double) support / transactions.size();
            if (supportRatio >= minSupport) {
                frequentItemSetsK.add(itemSet);
                localFrequentItemSets.put(itemSet, support);
            }
        }
        return frequentItemSetsK;
    }

    private Map<AprioriItemSet, Integer> getCandidateSupportCounts(Set<AprioriItemSet> candidateItemSets) {
        Map<AprioriItemSet, Integer> candidateSupportCounts = new HashMap<>();
        for (Set<String> transaction : transactions) {
            for (AprioriItemSet candidate : candidateItemSets) {
                if (candidate.getItems().size() <= transaction.size() &&
                        transaction.containsAll(candidate.getItems())) {
                    candidateSupportCounts.put(candidate, candidateSupportCounts.getOrDefault(candidate, 0) + 1);
                }
            }
        }
        return candidateSupportCounts;
    }

    private static Set<AprioriItemSet> getCandidateItemSets(Set<AprioriItemSet> frequentItemSetsK) {
        Set<AprioriItemSet> candidateItemSets = new HashSet<>();
        for (AprioriItemSet itemSet1 : frequentItemSetsK) {
            for (AprioriItemSet itemSet2 : frequentItemSetsK) {
                if (!itemSet1.equals(itemSet2)) {
                    AprioriItemSet mergedItemSet = itemSet1.merge(itemSet2);
                    if (mergedItemSet.getItems().size() == itemSet1.getItems().size() + 1) {
                        candidateItemSets.add(mergedItemSet);
                    }
                }
            }
        }
        return candidateItemSets;
    }

    private Set<AprioriItemSet> getFrequent1ItemSets(Map<AprioriItemSet, Integer> localFrequentItemSets, Map<String, Integer> itemCounts) {
        Set<AprioriItemSet> frequent1ItemSets = new HashSet<>();
        for (Map.Entry<String, Integer> entry : itemCounts.entrySet()) {
            String item = entry.getKey();
            int support = entry.getValue();
            double supportRatio = (double) support / transactions.size();
            if (supportRatio >= minSupport) {
                Set<String> itemSet = new HashSet<>();
                itemSet.add(item);
                frequent1ItemSets.add(new AprioriItemSet(itemSet));
                localFrequentItemSets.put(new AprioriItemSet(itemSet), support);
            }
        }
        return frequent1ItemSets;
    }

    private Map<String, Integer> countIndividualItems() {
        Map<String, Integer> itemCounts = new HashMap<>();
        for (Set<String> transaction : transactions) {
            for (String item : transaction) {
                itemCounts.put(item, itemCounts.getOrDefault(item, 0) + 1);
            }
        }
        return itemCounts;
    }

    public void generateAssociationRules(Map<AprioriItemSet, Integer> frequentItemSets, double minConfidence) {
        for (Map.Entry<AprioriItemSet, Integer> entry : frequentItemSets.entrySet()) {
            AprioriItemSet itemSet = entry.getKey();
            if (itemSet.getItems().size() > 1) {
                int support = entry.getValue();
                generateAssociationRules(itemSet, itemSet, support, minConfidence);
            }
        }
    }

    private void generateAssociationRules(AprioriItemSet itemSet, AprioriItemSet antecedent, int support, double minConfidence) {
        int k = itemSet.getItems().size();
        if (k > 1) {
            List<AprioriItemSet> candidateAntecedents = antecedent.generateCandidateItemSets();
            for (AprioriItemSet candidate : candidateAntecedents) {
                double confidence = (double) support / frequentItemSets.get(antecedent);
                if (confidence >= minConfidence) {
                    AprioriItemSet consequent = new AprioriItemSet(new HashSet<>(itemSet.getItems()));
                    consequent.getItems().removeAll(candidate.getItems());
                    System.out.println(candidate + " => " + consequent + " [support: " + support + ", confidence: " + confidence + "]");
                    generateAssociationRules(itemSet, candidate, support, minConfidence);
                }
            }
        }
    }
}
