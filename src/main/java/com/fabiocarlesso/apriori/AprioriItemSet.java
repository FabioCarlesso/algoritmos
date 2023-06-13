package com.fabiocarlesso.apriori;

import java.util.*;

public class AprioriItemSet {
    private Set<String> items;

    public AprioriItemSet(Set<String> items) {
        this.items = items;
    }

    public Set<String> getItems() {
        return items;
    }

    public boolean containsAll(Set<String> otherItems) {
        return items.containsAll(otherItems);
    }

    public AprioriItemSet merge(AprioriItemSet otherItemSet) {
        Set<String> mergedItems = new HashSet<>(items);
        mergedItems.addAll(otherItemSet.getItems());
        return new AprioriItemSet(mergedItems);
    }

    public List<AprioriItemSet> generateCandidateItemSets() {
        List<AprioriItemSet> candidates = new ArrayList<>();
        for (String item : items) {
            Set<String> newItemSet = new HashSet<>(items);
            newItemSet.remove(item);
            candidates.add(new AprioriItemSet(newItemSet));
        }
        return candidates;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AprioriItemSet that = (AprioriItemSet) o;
        return Objects.equals(items, that.items);
    }

    @Override
    public int hashCode() {
        return Objects.hash(items);
    }

    @Override
    public String toString() {
        return items.toString();
    }
}
