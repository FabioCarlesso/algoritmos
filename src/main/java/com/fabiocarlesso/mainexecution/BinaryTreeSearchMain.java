package com.fabiocarlesso.mainexecution;

import com.fabiocarlesso.binarysearch.BinaryTreeSearch;
import com.fabiocarlesso.binarysearch.TimeMap;
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
        searchRotatedMain();
        timeMapMain();
        findMedianSortedArraysMain();
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
    private static void searchRotatedMain() {
        System.out.println("\nSearch in Rotated Sorted Array");
        int[] nums = new int[]{4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(TARGET + target);
        System.out.println(RESULT_CASE_1 + BinaryTreeSearch.searchRotated(nums, target));
        target = 3;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(TARGET + target);
        System.out.println(RESULT_CASE_2 + BinaryTreeSearch.searchRotated(nums, target));
        nums = new int[]{1};
        target = -1;
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(TARGET + target);
        System.out.println(RESULT_CASE_3 + BinaryTreeSearch.searchRotated(nums, target));
    }
    private static void timeMapMain() {
        System.out.println("\nTime Based Key-Value Store");
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
        // return "bar"
        System.out.println(RESULT_CASE_1 + timeMap.get("foo", 1));
        // return "bar", since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
        System.out.println(RESULT_CASE_1 + timeMap.get("foo", 3));
        timeMap.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
        // return "bar2"
        System.out.println(RESULT_CASE_1 + timeMap.get("foo", 4));
        // return "bar2"
        System.out.println(RESULT_CASE_1 + timeMap.get("foo", 5));
    }
    private static void findMedianSortedArraysMain() {
        System.out.println("\nMedian of Two Sorted Arrays");
        int[] nums = new int[]{1,3};
        int[] nums2 = new int[]{2};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(ARRAY_TEXT + Arrays.toString(nums2));
        System.out.println(RESULT_CASE_1 + BinaryTreeSearch.findMedianSortedArrays(nums, nums2));
        nums = new int[]{1,2};
        nums2 = new int[]{3,4};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(ARRAY_TEXT + Arrays.toString(nums2));
        System.out.println(RESULT_CASE_2 + BinaryTreeSearch.findMedianSortedArrays(nums, nums2));
        nums = new int[]{1,3,5,9,10};
        nums2 = new int[]{2,4,6,8,9,12,25};
        System.out.println(ARRAY_TEXT + Arrays.toString(nums));
        System.out.println(ARRAY_TEXT + Arrays.toString(nums2));
        System.out.println(RESULT_CASE_3 + BinaryTreeSearch.findMedianSortedArrays(nums, nums2));
    }
}
