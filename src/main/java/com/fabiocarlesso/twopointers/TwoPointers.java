package com.fabiocarlesso.twopointers;

import java.util.Arrays;

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

    public static int minimumDifference(int[] nums, int k) {
        if(k == 1) return 0;
        Arrays.sort(nums);
        int min = Integer.MAX_VALUE;
        for(int i=0; i<nums.length-k+1; i++) {
            int diff = Math.abs(nums[i] - nums[i+k-1]);
            min = Math.min(diff, min);
        }
        return min;
    }

    public static void reverseString(char[] s) {
        int l = 0;
        int r = s.length - 1;
        while(l <= r) {
            char tmp = s[l];
            s[l++] = s[r];
            s[r--] = tmp;
        }
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int r1 = m-1;
        int r2 = n-1;

        for(int w = m+n-1; w >= 0; w--) {
            if(r1 >= 0 && r2 >= 0) {
                nums1[w] = nums1[r1] > nums2[r2] ? nums1[r1--] : nums2[r2--];
            } else if (r1 >= 0) {
                nums1[w] = nums1[r1--];
            } else {
                nums1[w] = nums2[r2--];
            }
        }
    }

}
