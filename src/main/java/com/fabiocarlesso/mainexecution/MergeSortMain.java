package com.fabiocarlesso.mainexecution;

import static com.fabiocarlesso.mergesort.MergeSort.mergeSort;
import static com.fabiocarlesso.util.Utils.printArray;

public class MergeSortMain {
    public static void mergeSortMain() {
        System.out.println("\n\n Merge Sort");
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};

        System.out.println("Array antes da ordenação:");
        printArray(array);

        mergeSort(array, 0, array.length - 1);

        System.out.println("\nArray após a ordenação:");
        printArray(array);
    }
}
