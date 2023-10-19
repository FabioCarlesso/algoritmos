package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.binarysearch.BinaryTreeSearch;

import java.util.Arrays;

public class BinaryTreeSearchMain {
    private static final String ARRAY_TEXT = "Array: ";
    public static final String RESULT_CASE_1 = "Result case 1: ";
    public static final String RESULT_CASE_2 = "Result case 2: ";
    public static final String RESULT_CASE_3 = "Result case 3: ";
    private BinaryTreeSearchMain(){
        throw new IllegalStateException("Utility class");
    }
    public static void binaryTreeSearchMain(){
        System.out.println("\n\nBinary Tree Search");
        searchMain();
        searchMatrixMain();
    }
    private static void searchMain() {
        System.out.println("\nBinary Search");
        int[] nums = new int[]{-1,0,3,5,9,12};
        int target = 9;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        String targetString = "Target: ";
        System.out.println(targetString + target);
        System.out.println(RESULT_CASE_1 + BinaryTreeSearch.search(nums, target));
        target = 2;
        System.out.println(targetString + target);
        System.out.println(RESULT_CASE_2 + BinaryTreeSearch.search(nums, target));
        target = 5;
        System.out.println(targetString + target);
        System.out.println(RESULT_CASE_3 + BinaryTreeSearch.search(nums, target));
    }
    private static void searchMatrixMain() {
        System.out.println("\nSearch a 2D Matrix");
        int[][] nums = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        String targetString = "Target: ";
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(targetString + target);
        System.out.println(RESULT_CASE_1 + BinaryTreeSearch.searchMatrix(nums, target));
        nums = new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        target = 2;
        System.out.println(targetString + target);
        System.out.println(RESULT_CASE_2 + BinaryTreeSearch.searchMatrix(nums, target));
    }
}
