package com.fabiocarlesso.mainexecution;

import static com.fabiocarlesso.insertionsort.InsertionSort.insertionSort;
import static com.fabiocarlesso.util.Utils.printArray;

public class InsertionSortMain {
    private InsertionSortMain() {
        throw new IllegalStateException("Utility class");
    }
    public static void insertionSortMain() {
        System.out.println("\n\n Insertion Sort");
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};

        System.out.println("Array antes da ordenação:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nArray após a ordenação:");
        printArray(array);
    }
}
