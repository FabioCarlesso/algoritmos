package com.fabiocarlesso.util;

public class Utils {
    private Utils() {
        throw new IllegalStateException("Utility class");
    }
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
