package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.twopointers.TwoPointers;

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

}
