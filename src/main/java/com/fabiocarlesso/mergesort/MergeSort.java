package com.fabiocarlesso.mergesort;

public class MergeSort {
    private MergeSort() {
        throw new IllegalStateException("Utility class");
    }
    public static void mergeSort(int[] array, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(array, left, middle);
            mergeSort(array, middle + 1, right);

            merge(array, left, middle, right);
        }
    }

    public static void merge(int[] array, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        System.arraycopy(array, left, leftArray, 0, n1);
        System.arraycopy(array, middle + 1, rightArray, 0, n2);

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        mergeArrayLeftRight(array, n1, leftArray, i, k);
        mergeArrayLeftRight(array, n2, rightArray, j, k);
    }

    private static void mergeArrayLeftRight(int[] array, int n1, int[] leftArray, int i, int k) {
        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
    }
}
