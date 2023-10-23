package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.binarysearch.BinaryTreeSearch;
import com.fabiocarlesso.util.Utils;

import java.util.Arrays;

public class BinaryTreeSearchMain {
    private static final String ARRAY_TEXT = "Array: ";
    public static final String RESULT_CASE_1 = "Result case 1: ";
    public static final String RESULT_CASE_2 = "Result case 2: ";
    public static final String RESULT_CASE_3 = "Result case 3: ";
    public static final String TARGET = "Target: ";
    private BinaryTreeSearchMain(){
        throw new IllegalStateException("Utility class");
    }
    public static void binaryTreeSearchMain(){
        System.out.println("\n\nBinary Tree Search");
        searchMain();
        searchMatrixMain();
        minEatingSpeedMain();
        findMinMain();
    }
    private static void searchMain() {
        System.out.println("\nBinary Search");
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(TARGET + target);
        System.out.println(RESULT_CASE_1 + BinaryTreeSearch.search(nums, target));
        target = 2;
        System.out.println(TARGET + target);
        System.out.println(RESULT_CASE_2 + BinaryTreeSearch.search(nums, target));
        target = 5;
        System.out.println(TARGET + target);
        System.out.println(RESULT_CASE_3 + BinaryTreeSearch.search(nums, target));
    }
    private static void searchMatrixMain() {
        System.out.println("\nSearch a 2D Matrix");
        int[][] nums = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(ARRAY_TEXT);
        Utils.printMatrix(nums);
        System.out.println(TARGET + target);
        System.out.println(RESULT_CASE_1 + BinaryTreeSearch.searchMatrix(nums, target));
        target = 2;
        System.out.println(ARRAY_TEXT);
        Utils.printMatrix(nums);
        System.out.println(TARGET + target);
        System.out.println(RESULT_CASE_2 + BinaryTreeSearch.searchMatrix(nums, target));
    }
    private static void minEatingSpeedMain() {
        System.out.println("\nKoko Eating Bananas");
        int[] piles = new int[]{3,6,7,11};
        int target = 8;
        System.out.println(ARRAY_TEXT + Arrays.toString(piles));
        System.out.println(TARGET + target);
        System.out.println(RESULT_CASE_1 + BinaryTreeSearch.minEatingSpeed(piles, target));
        piles = new int[]{30,11,23,4,20};
        target = 5;
        System.out.println(ARRAY_TEXT + Arrays.toString(piles));
        System.out.println(TARGET + target);
        System.out.println(RESULT_CASE_2 + BinaryTreeSearch.minEatingSpeed(piles, target));
        target = 6;
        System.out.println(ARRAY_TEXT + Arrays.toString(piles));
        System.out.println(TARGET + target);
        System.out.println(RESULT_CASE_3 + BinaryTreeSearch.minEatingSpeed(piles, target));
    }
    private static void findMinMain() {
        System.out.println("\nFind Minimum in Rotated Sorted Array");
        int[] nums = new int[]{3,4,5,1,2};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_1 + BinaryTreeSearch.findMin(nums));
        nums = new int[]{4,5,6,7,0,1,2};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_2 + BinaryTreeSearch.findMin(nums));
        nums = new int[]{11,13,15,17};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(RESULT_CASE_3 + BinaryTreeSearch.findMin(nums));
    }
}
