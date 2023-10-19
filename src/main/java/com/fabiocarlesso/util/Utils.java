package com.fabiocarlesso.util;

import java.util.Arrays;

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

    public static String intArrayToStringTarget(int[] array, int target) {
        if (array == null)
            return "null";
        int iMax = array.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            if (i == target)
                return b.append(']').toString();
            b.append(array[i]);
            if(i < (target-1))
                b.append(", ");
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public static void printMatrix(int[][] matrix) {
        Arrays.stream(matrix).map(Arrays::toString).forEach(System.out::println);
    }
}
