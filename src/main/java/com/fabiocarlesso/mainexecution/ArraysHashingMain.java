package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.arrayshashing.ArraysHashing;

import java.util.Arrays;

public class ArraysHashingMain {
    private ArraysHashingMain() {
        throw new IllegalStateException("Utility class");
    }
    public static void arraysHashingMain() {
        System.out.println("\n\n Arrays Hashing");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("No duplicates: " + ArraysHashing.arrayIntContainsDuplicate(numbers));

        int[] numbersWithDuplicate = {1, 2, 3, 2, 4, 5};
        System.out.println("\nArray: " + Arrays.toString(numbersWithDuplicate));
        System.out.println("Contains Duplicate: " + ArraysHashing.arrayIntContainsDuplicate(numbersWithDuplicate));
    }
}
