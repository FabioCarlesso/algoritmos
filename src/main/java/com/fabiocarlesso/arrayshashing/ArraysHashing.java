package com.fabiocarlesso.arrayshashing;

import java.util.Arrays;

public class ArraysHashing {
    private ArraysHashing() {
        throw new IllegalStateException("Utility class");
    }

    public static boolean arrayIntContainsDuplicate(int[] numbers){
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

}
