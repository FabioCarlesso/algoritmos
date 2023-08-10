package com.fabiocarlesso.arrayshashing;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RandomizedSet {
    private Map<Integer, Integer> indexing;
    @Getter
    private List<Integer> numbers;

    public RandomizedSet() {
        this.indexing = new HashMap<>();
        this.numbers = new ArrayList<>();
    }

    public boolean insert(int val) {
        if(this.indexing.containsKey(val)) {
            return false;
        }
        int indexInsert = this.numbers.size();
        this.numbers.add(val);
        this.indexing.put(val, indexInsert);
        return true;
    }

    public boolean remove(int val) {
        if(!this.indexing.containsKey(val)) {
            return false;
        }

        int lastIndex = this.numbers.size() - 1;
        int lastElement = this.numbers.get(lastIndex);
        int indexElement = this.indexing.get(val);

        this.numbers.set(indexElement, lastElement);

        this.indexing.put(lastElement, indexElement);
        this.indexing.remove(val);

        this.numbers.remove(lastIndex);
        return true;
    }

    public int getRandom() {
        int randomIndex = (int) (Math.random() * this.numbers.size());
        return this.numbers.get(randomIndex);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
