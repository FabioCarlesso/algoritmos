package com.fabiocarlesso.mainexecution;

import static com.fabiocarlesso.insertionsort.InsertionSort.insertionSort;

public class InsertionSortMain {
    public static void insertionSortMain() {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};

        System.out.println("Array antes da ordenação:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nArray após a ordenação:");
        printArray(array);
    }

    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
