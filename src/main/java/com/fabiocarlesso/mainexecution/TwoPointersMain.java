package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.twopointers.TwoPointers;

import java.util.Arrays;
import java.util.List;

public class TwoPointersMain {
    private static final String ARRAY_TEXT = "Array: ";
    public static final String RESULT_CASE_1 = "Result case 1: ";
    public static final String RESULT_CASE_2 = "Result case 2: ";
    public static final String RESULT_CASE_3 = "Result case 3: ";
    private TwoPointersMain() {
        throw new IllegalStateException("Utility class");
    }
    public static void twoPointersMain() {
        System.out.println("\n\nTwo Pointers");
        isPalindromeMain();
        validPalindromeMain();
        minimumDifferenceMain();
        reverseStringMain();
        mergeMain();
        moveZeroesMain();
        removeDuplicatesMain(); //A lição era remove, mas é mais uma count duplicates
        twoSumMain();
        threeSumMain();
    }
    private static void isPalindromeMain() {
        System.out.println("\n\nValid Palindrome");
        String phrase = "A man, a plan, a canal: Panama";
        System.out.println(ARRAY_TEXT + phrase);
        System.out.println(RESULT_CASE_1 + TwoPointers.isPalindrome(phrase));
        phrase = "race a car";
        System.out.println(ARRAY_TEXT + phrase);
        System.out.println(RESULT_CASE_2 + TwoPointers.isPalindrome(phrase));
        phrase = "";
        System.out.println(ARRAY_TEXT + phrase);
        System.out.println(RESULT_CASE_3 + TwoPointers.isPalindrome(phrase));
    }

    private static void validPalindromeMain() {
        System.out.println("\n\nValid Palindrome II");
        String phrase = "aba";
        System.out.println(ARRAY_TEXT + phrase);
        System.out.println(RESULT_CASE_1 + TwoPointers.validPalindrome(phrase));
        phrase = "abca";
        System.out.println(ARRAY_TEXT + phrase);
        System.out.println(RESULT_CASE_2 + TwoPointers.validPalindrome(phrase));
        phrase = "abc";
        System.out.println(ARRAY_TEXT + phrase);
        System.out.println(RESULT_CASE_3 + TwoPointers.validPalindrome(phrase));
    }

    private static void minimumDifferenceMain() {
        System.out.println("\n\nMinimum Difference Between Highest and Lowest of K Scores");
        int[] nums = {90};
        int k = 1;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("K: " + k);
        System.out.println(RESULT_CASE_1 + TwoPointers.minimumDifference(nums, k));
        nums = new int[] {9,4,1,7};
        k = 2;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("K: " + k);
        System.out.println(RESULT_CASE_2 + TwoPointers.minimumDifference(nums, k));
    }

    private static void reverseStringMain() {
        System.out.println("\n\nReverse String");
        char[] phrase = "hello".toCharArray();
        System.out.println(ARRAY_TEXT + Arrays.toString(phrase));
        TwoPointers.reverseString(phrase);
        System.out.println(RESULT_CASE_1 + Arrays.toString(phrase));
        phrase = "Hannah".toCharArray();
        System.out.println(ARRAY_TEXT + Arrays.toString(phrase));
        TwoPointers.reverseString(phrase);
        System.out.println(RESULT_CASE_2 + Arrays.toString(phrase));
    }

    private static void mergeMain() {
        System.out.println("\n\nMerge Sorted Array");
        int[] nums = {1,2,3,0,0,0};
        int m = 3;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("m: " + m);
        int[] nums2 = {2,5,6};
        int n = 3;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums2));
        System.out.println("n: " + n);
        TwoPointers.merge(nums, m, nums2, n);
        System.out.println(RESULT_CASE_1 + Arrays.toString(nums));
        nums = new int[] {1};
        m = 1;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("m: " + m);
        nums2 = new int[]{};
        n = 0;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums2));
        System.out.println("n: " + n);
        TwoPointers.merge(nums, m, nums2, n);
        System.out.println(RESULT_CASE_2 + Arrays.toString(nums));
        nums = new int[] {0};
        m = 0;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println("m: " + m);
        nums2 = new int[]{1};
        n = 1;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums2));
        System.out.println("n: " + n);
        TwoPointers.merge(nums, m, nums2, n);
        System.out.println(RESULT_CASE_3 + Arrays.toString(nums));
    }

    private static void moveZeroesMain() {
        System.out.println("\n\nMove Zeroes");
        int[] nums = {0,1,0,3,12};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        TwoPointers.moveZeroes(nums);
        System.out.println(RESULT_CASE_1 + Arrays.toString(nums));
        nums = new int[] {0};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        TwoPointers.moveZeroes(nums);
        System.out.println(RESULT_CASE_2 + Arrays.toString(nums));
        nums = new int[] {1,2,3,0,0,0};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        TwoPointers.moveZeroes(nums);
        System.out.println(RESULT_CASE_3 + Arrays.toString(nums));
    }

    private static void removeDuplicatesMain() {
        System.out.println("\n\nRemove Duplicates from Sorted Array (count duplicated)");
        int[] nums = {1,1,2};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_1 + TwoPointers.removeDuplicates(nums));
        nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_2 + TwoPointers.removeDuplicates(nums));
    }

    private static void twoSumMain() {
        System.out.println("\n\nTwo Sum II - Input Array Is Sorted");
        int[] numbers = {2,7,11,15};
        int target = 9;
        String targetString = "Target: ";
        System.out.println(ARRAY_TEXT + Arrays.toString(numbers));
        System.out.println(targetString + target);
        System.out.println(RESULT_CASE_1 + Arrays.toString(TwoPointers.twoSum(numbers, target)));
        numbers = new int[] {2,3,4};
        target = 6;
        System.out.println(ARRAY_TEXT + Arrays.toString(numbers));
        System.out.println(targetString + target);
        System.out.println(RESULT_CASE_2 + Arrays.toString(TwoPointers.twoSum(numbers, target)));
        numbers = new int[] {-1,0};
        target = -1;
        System.out.println(ARRAY_TEXT + Arrays.toString(numbers));
        System.out.println(targetString + target);
        System.out.println(RESULT_CASE_3 + Arrays.toString(TwoPointers.twoSum(numbers, target)));
    }

    private static void threeSumMain() {
        System.out.println("\n\n3Sum");
        int[] numbers = {-1,0,1,2,-1,-4};
        System.out.println(ARRAY_TEXT + Arrays.toString(numbers));
        System.out.println(RESULT_CASE_1 + Arrays.toString(new List[]{TwoPointers.threeSum(numbers)}));
        numbers = new int[] {0,1,1};
        System.out.println(ARRAY_TEXT + Arrays.toString(numbers));
        System.out.println(RESULT_CASE_2 + Arrays.toString(new List[]{TwoPointers.threeSum(numbers)}));
        numbers = new int[] {0,0,0};
        System.out.println(ARRAY_TEXT + Arrays.toString(numbers));
        System.out.println(RESULT_CASE_2 + Arrays.toString(new List[]{TwoPointers.threeSum(numbers)}));
    }

}
