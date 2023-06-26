package com.fabiocarlesso.arrayshashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArraysHashing {
    private ArraysHashing() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean containsArrayIntDuplicate(int[] numbers){
        return Arrays.stream(numbers)
                .distinct()
                .count() < numbers.length;
    }

    public static boolean isAnagram(String word, String anagramWord){
        if (word.length() != anagramWord.length()) {
            return false;
        }

        char[] wordChars = word.toCharArray();
        char[] anagramWordChars = anagramWord.toCharArray();

        Arrays.sort(wordChars);
        Arrays.sort(anagramWordChars);

        return Arrays.equals(wordChars, anagramWordChars);
    }

    public static int[] getArrayIntConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }

        return ans;
    }

    public static int[] replaceElementsOnRightSideFromArrayInt(int[] arr) {
        int n = arr.length;
        int max = -1;

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            max = Math.max(max, temp);
        }

        return arr;
    }

    public static boolean isSubsequence(String s, String t) {
        int sIndex = 0;
        int tIndex = 0;

        while (sIndex < s.length() && tIndex < t.length()) {
            if (s.charAt(sIndex) == t.charAt(tIndex)) {
                sIndex++;
            }
            tIndex++;
        }

        return sIndex == s.length();
    }

    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        int lastIndex = s.length() - 1;
        while (lastIndex >= 0 && s.charAt(lastIndex) != ' ') {
            length++;
            lastIndex--;
        }
        return length;
    }

    public static int[] twoSumArrayInt(int[] numbers, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = target - numbers[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(numbers[i], i);
        }

        return new int[0];
    }

}
