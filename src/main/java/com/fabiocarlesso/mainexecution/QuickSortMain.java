package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.quicksort.QuickSort;

public class QuickSortMain {
    public static void quickSortMain() {
        System.out.println("\n\n Quick Sort");
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};

        System.out.println("Array antes da ordenação:");
        printArray(array);

        QuickSort q = new QuickSort();
        q.quickSort(array, 0, array.length - 1);

        System.out.println("\nArray após a ordenação:");
        printArray(array);
    }

    private static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
