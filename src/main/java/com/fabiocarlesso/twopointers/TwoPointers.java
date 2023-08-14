package com.fabiocarlesso.twopointers;

public class TwoPointers {

    private TwoPointers() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char start = s.charAt(i);
            char end = s.charAt(j);
            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }
            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }
            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while(i < j)
            if(s.charAt(i) == s.charAt(j)) {
                i += 1;
                j -= 1;
            }else
                return validPalindromeUtil(s, i + 1, j) || validPalindromeUtil(s, i, j - 1);
        return true;
    }

    private static boolean validPalindromeUtil(String s, int i, int j) {
        while(i < j)
            if(s.charAt(i) == s.charAt(j)) {
                i += 1;
                j -= 1;
            } else {
                return false;
            }
        return true;
    }

}
