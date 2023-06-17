package com.fabiocarlesso.mainexecution;

import static com.fabiocarlesso.insertionsort.InsertionSort.insertionSort;
import static com.fabiocarlesso.util.Utils.printArray;

public class InsertionSortMain {
    public static void insertionSortMain() {
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};

        System.out.println("Array antes da ordenação:");
        printArray(array);

        insertionSort(array);

        System.out.println("\nArray após a ordenação:");
        printArray(array);
    }
}
