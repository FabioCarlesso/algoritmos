package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.arrayshashing.ArraysHashing;

import java.util.Arrays;

public class ArraysHashingMain {
    private ArraysHashingMain() {
        throw new IllegalStateException("Utility class");
    }
    public static void arraysHashingMain() {
        System.out.println("\n\nArrays Hashing");
        arrayIntContainsDuplicateMain();
        isAnagramMain();
        getArrayIntConcatenationMain();
    }

    private static void isAnagramMain() {
        System.out.println("\n\nIs Anagram");
        String word = "alert";
        String anagram = "later";
        System.out.println("Word: " + word);
        System.out.println("Anagram: " + anagram);
        System.out.println("Is anagram: " + ArraysHashing.isAnagram(word, anagram));

        String wordRat = "rat";
        String anagramCar = "car";
        System.out.println("\nWord: " + wordRat);
        System.out.println("Anagram: " + anagramCar);
        System.out.println("Is anagram: " + ArraysHashing.isAnagram(wordRat, anagramCar));
    }

    private static void arrayIntContainsDuplicateMain() {
        System.out.println("\n\nArray Int Contains Duplicate");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println("No duplicates: " + ArraysHashing.containsArrayIntDuplicate(numbers));

        int[] numbersWithDuplicate = {1, 2, 3, 2, 4, 5};
        System.out.println("\nArray: " + Arrays.toString(numbersWithDuplicate));
        System.out.println("Contains Duplicate: " + ArraysHashing.containsArrayIntDuplicate(numbersWithDuplicate));
    }

    private static void getArrayIntConcatenationMain() {
        System.out.println("\n\nArray Int Concatenation");
        int[] nums = {1, 2, 3};
        int[] concatenated = ArraysHashing.getArrayIntConcatenation(nums);

        System.out.println("Array: " + Arrays.toString(nums));
        System.out.println("Concatenation: " + Arrays.toString(concatenated));

    }
}
