package com.fabiocarlesso.mainexecution;

import static com.fabiocarlesso.quicksort.QuickSort.quickSort;
import static com.fabiocarlesso.util.Utils.printArray;

public class QuickSortMain {
    public static void quickSortMain() {
        System.out.println("\n\n Quick Sort");
        int[] array = {7, 2, 1, 6, 8, 5, 3, 4};

        System.out.println("Array antes da ordenação:");
        printArray(array);

        quickSort(array, 0, array.length - 1);

        System.out.println("\nArray após a ordenação:");
        printArray(array);
    }
}
