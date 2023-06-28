package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.arrayshashing.ArraysHashing;

import java.util.Arrays;

public class ArraysHashingMain {
    private static final String ARRAY_TEXT = "Array: ";

    private ArraysHashingMain() {
        throw new IllegalStateException("Utility class");
    }
    public static void arraysHashingMain() {
        System.out.println("\n\nArrays Hashing");
        arrayIntContainsDuplicateMain();
        isAnagramMain();
        getArrayIntConcatenationMain();
        replaceElementsOnRightSideFromArrayIntMain();
        isSubsequenceMain();
        lengthOfLastWordMain();
        twoSumArrayIntMain();
        longestCommonPrefixMain();
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
        System.out.println(ARRAY_TEXT + Arrays.toString(numbers));
        System.out.println("No duplicates: " + ArraysHashing.containsArrayIntDuplicate(numbers));

        int[] numbersWithDuplicate = {1, 2, 3, 2, 4, 5};
        System.out.println("\n" + ARRAY_TEXT + Arrays.toString(numbersWithDuplicate));
        System.out.println("Contains Duplicate: " + ArraysHashing.containsArrayIntDuplicate(numbersWithDuplicate));
    }

    private static void getArrayIntConcatenationMain() {
        System.out.println("\n\nArray Int Concatenation");
        int[] nums = {1, 2, 3};
        int[] concatenated = ArraysHashing.getArrayIntConcatenation(nums);

        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("Concatenation: " + Arrays.toString(concatenated));

    }

    private static void replaceElementsOnRightSideFromArrayIntMain() {
        System.out.println("\n\nArray Int Replace Elements On Right Side");
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(ARRAY_TEXT + Arrays.toString(arr));
        int[] replaced = ArraysHashing.replaceElementsOnRightSideFromArrayInt(arr);
                System.out.println("Replace Elements: " + Arrays.toString(replaced));

        int[] arrTest = {400};
        System.out.println("\n" + ARRAY_TEXT + Arrays.toString(arrTest));
        int[] replacedError = ArraysHashing.replaceElementsOnRightSideFromArrayInt(arrTest);
        System.out.println("Replace Elements error: " + Arrays.toString(replacedError));
    }

    private static void isSubsequenceMain() {
        System.out.println("\n\nIs Subsequence");
        String subSequence = "ace";
        String sequence = "abcde";
        System.out.println("Subsequence: " + subSequence);
        System.out.println("Sequence: " + sequence);
        System.out.println("Is Subsequence: " + ArraysHashing.isSubsequence(subSequence, sequence));

        String subSequenceFalse = "aec";
        System.out.println("Subsequence: " + subSequenceFalse);
        System.out.println("Sequence: " + sequence);
        System.out.println("Is Subsequence: " + ArraysHashing.isSubsequence(subSequenceFalse, sequence));
    }

    private static void lengthOfLastWordMain() {
        System.out.println("\n\nLength Of Last Word");
        String phrase = "Hello World";
        String phrase2 = "   Java Programming   ";
        String phrase3 = "   fly me   to   the moon  ";
        System.out.println("Phrase 1: " + phrase);
        System.out.println("Length Of Last Word 1: " + ArraysHashing.lengthOfLastWord(phrase));
        System.out.println("Phrase 2: " + phrase2);
        System.out.println("Length Of Last Word 2: " + ArraysHashing.lengthOfLastWord(phrase2));
        System.out.println("Phrase 3: " + phrase3);
        System.out.println("Length Of Last Word 3: " + ArraysHashing.lengthOfLastWord(phrase3));
    }

    private static void twoSumArrayIntMain() {
        System.out.println("\n\nTwo Sum Array Int");
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = ArraysHashing.twoSumArrayInt(nums, target);
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("Target 1: " + target);
        System.out.println("Indices 1: " + result[0] + ", " + result[1]);

        int[] nums2 = {3,2,4};
        int[] nums3 = {3,3};
        int target2 = 6;
        int[] result2 = ArraysHashing.twoSumArrayInt(nums2, target2);
        System.out.println("\n"+ARRAY_TEXT + Arrays.toString(nums2));
        System.out.println("Target 2: " + target2);
        System.out.println("Indices 2: " + result2[0] + ", " + result2[1]);
        int[] result3 = ArraysHashing.twoSumArrayInt(nums3, target2);
        System.out.println("\n"+ARRAY_TEXT + Arrays.toString(nums3));
        System.out.println("Target 3: " + target2);
        System.out.println("Indices 3: " + result3[0] + ", " + result3[1]);
    }

    private static void longestCommonPrefixMain() {
        System.out.println("\n\nLongest Common Prefix");
        String[] strs = {"flower","flow","flight"};
        System.out.println(ARRAY_TEXT + Arrays.toString(strs));
        System.out.println("Longest Common Prefix case 1: " + ArraysHashing.longestCommonPrefix(strs));
        String[] strs2 = {"dog","racecar","car"};
        System.out.println(ARRAY_TEXT + Arrays.toString(strs2));
        System.out.println("Longest Common Prefix case 2: " + ArraysHashing.longestCommonPrefix(strs2));
    }

}
