package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.slidingwindow.SlidingWindow;

import java.util.Arrays;

public class SlidingWindowMain {
    private static final String ARRAY_TEXT = "Array: ";
    public static final String RESULT_CASE_1 = "Result case 1: ";
    public static final String RESULT_CASE_2 = "Result case 2: ";
    public static final String RESULT_CASE_3 = "Result case 3: ";
    private SlidingWindowMain(){
        throw new IllegalStateException("Utility class");
    }
    public static void slidingWindowMain(){
        System.out.println("\n\nSliding Window");
        maxProfitMain();
    }

    private static void maxProfitMain() {
        System.out.println("\nBest Time to Buy and Sell Stock");
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(ARRAY_TEXT + Arrays.toString(prices));
        System.out.println(RESULT_CASE_1 + SlidingWindow.maxProfit(prices));
        prices = new int[]{7,6,4,3,1};
        System.out.println(ARRAY_TEXT + Arrays.toString(prices));
        System.out.println(RESULT_CASE_2 + SlidingWindow.maxProfit(prices));
    }

}
