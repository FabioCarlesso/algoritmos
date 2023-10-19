package com.fabiocarlesso.binarysearch;

public class BinaryTreeSearch {
    private BinaryTreeSearch(){
        throw new IllegalStateException("Utility class");
    }
    public static int search(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                i = mid + 1;
            } else j = mid - 1;
        }
        return -1;
    }
    public static boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0) return false;

        int rows = matrix.length;
        int columns = matrix[0].length;

        int low = 0;
        int high = rows * columns;

        while(low < high) {
            int mid = (low+high)/2;

            if(matrix[mid/columns][mid%columns] == target) {
                return true;
            } else if (matrix[mid/columns][mid%columns] < target) {
                low = mid+1;
            } else {
                high = mid;
            }
        }
        return false;
    }
}
