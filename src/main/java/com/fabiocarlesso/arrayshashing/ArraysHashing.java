package com.fabiocarlesso.arrayshashing;

import java.util.Arrays;

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

}
