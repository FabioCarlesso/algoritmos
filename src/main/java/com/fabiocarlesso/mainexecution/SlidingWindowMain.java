package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.slidingwindow.SlidingWindow;

import java.util.Arrays;

public class SlidingWindowMain {
    private static final String ARRAY_TEXT = "Array: ";
    public static final String RESULT_CASE_1 = "Result case 1: ";
    public static final String RESULT_CASE_2 = "Result case 2: ";
    public static final String RESULT_CASE_3 = "Result case 3: ";
    private SlidingWindowMain(){
        throw new IllegalStateException("Utility class");
    }
    public static void slidingWindowMain(){
        System.out.println("\n\nSliding Window");
        maxProfitMain();
        lengthOfLongestSubstringMain();
        characterReplacementMain();
        checkInclusionMain();
        minWindowMain();
        maxSlidingWindowMain();
    }

    private static void maxProfitMain() {
        System.out.println("\nBest Time to Buy and Sell Stock");
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(ARRAY_TEXT + Arrays.toString(prices));
        System.out.println(RESULT_CASE_1 + SlidingWindow.maxProfit(prices));
        prices = new int[]{7,6,4,3,1};
        System.out.println(ARRAY_TEXT + Arrays.toString(prices));
        System.out.println(RESULT_CASE_2 + SlidingWindow.maxProfit(prices));
    }

    private static void lengthOfLongestSubstringMain() {
        System.out.println("\nLongest Substring Without Repeating Characters");
        String input = "abcabcbb";
        System.out.println(ARRAY_TEXT + input);
        System.out.println(RESULT_CASE_1 + SlidingWindow.lengthOfLongestSubstring(input));
        input = "bbbbb";
        System.out.println(ARRAY_TEXT + input);
        System.out.println(RESULT_CASE_2 + SlidingWindow.lengthOfLongestSubstring(input));
        input = "pwwkew";
        System.out.println(ARRAY_TEXT + input);
        System.out.println(RESULT_CASE_3 + SlidingWindow.lengthOfLongestSubstring(input));
    }

    private static void characterReplacementMain() {
        System.out.println("\nLongest Repeating Character Replacement");
        String input = "ABAB";
        int k = 2;
        System.out.println(ARRAY_TEXT + input);
        System.out.println("k: " + k);
        System.out.println(RESULT_CASE_1 + SlidingWindow.characterReplacement(input, k));
        input = "AABABBA";
        k = 1;
        System.out.println(ARRAY_TEXT + input);
        System.out.println("k: " + k);
        System.out.println(RESULT_CASE_2 + SlidingWindow.characterReplacement(input, k));
    }

    private static void checkInclusionMain() {
        System.out.println("\nPermutation in String");
        String input = "ab";
        String sentence = "eidbaooo";
        System.out.println(ARRAY_TEXT + input);
        System.out.println("Sentence: " + sentence);
        System.out.println(RESULT_CASE_1 + SlidingWindow.checkInclusion(input, sentence));
        input = "ab";
        sentence = "eidboaoo";
        System.out.println(ARRAY_TEXT + input);
        System.out.println("Sentence: " + sentence);
        System.out.println(RESULT_CASE_2 + SlidingWindow.checkInclusion(input, sentence));
    }

    private static void minWindowMain() {
        System.out.println("\nMinimum Window Substring");
        String input = "ADOBECODEBANC";
        String substringToCheck = "ABC";
        System.out.println(ARRAY_TEXT + input);
        String substringText = "Substring to check: ";
        System.out.println(substringText + substringToCheck);
        System.out.println(RESULT_CASE_1 + SlidingWindow.minWindow(input, substringToCheck));
        input = "a";
        substringToCheck = "a";
        System.out.println(ARRAY_TEXT + input);
        System.out.println(substringText + substringToCheck);
        System.out.println(RESULT_CASE_2 + SlidingWindow.minWindow(input, substringToCheck));
        input = "a";
        substringToCheck = "aa";
        System.out.println(ARRAY_TEXT + input);
        System.out.println(substringText + substringToCheck);
        System.out.println(RESULT_CASE_3 + SlidingWindow.minWindow(input, substringToCheck));
    }

    private static void maxSlidingWindowMain() {
        System.out.println("\nSliding Window Maximum");
        int[] nums = new int[]{1,3,-1,-3,5,3,6,7};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        int k = 3;
        System.out.println("K: " + k);
        System.out.println(RESULT_CASE_1 + Arrays.toString(SlidingWindow.maxSlidingWindow(nums, k)));
        nums = new int[]{1};
        k = 1;
        System.out.println("K: " + k);
        System.out.println(RESULT_CASE_2 + Arrays.toString(SlidingWindow.maxSlidingWindow(nums, k)));
    }

}
