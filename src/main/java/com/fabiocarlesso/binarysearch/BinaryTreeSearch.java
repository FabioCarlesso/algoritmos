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
    public static int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 1;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }

        while (left < right) {
            int middle = (left + right) / 2;
            int hourSpent = 0;
            for (int pile : piles) {
                hourSpent += (int) Math.ceil((double) pile / middle);
            }

            if (hourSpent <= h) {
                right = middle;
            } else {
                left = middle + 1;
            }
        }

        return right;
    }
    public static int findMin(int[] nums) {
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            if (nums[l] <= nums[r]) {
                return nums[l];
            }

            int mid = (l + r) / 2;
            if (nums[mid] >= nums[l]) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return 0;
    }
    public static int searchRotated (int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid] == target){
                return mid;
            }
            //left sorted
            if(nums[l]<=nums[mid]){
                if(target > nums[mid] || target < nums[l]){
                    l = mid + 1;
                }else{
                    r = mid - 1;
                }
            }else{//right sorted
                if(target < nums[mid] || target > nums [r]){
                    r = mid - 1;
                }else{
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        if (m > n) return findMedianSortedArrays(nums2, nums1);

        int total = m + n;
        int half = (total + 1) / 2;

        int left = 0;
        int right = m;

        var result = 0.0;

        while (left <= right) {
            int i = left + (right - left) / 2;
            int j = half - i;

            // get the four points around possible median
            int left1 = (i > 0) ? nums1[i - 1] : Integer.MIN_VALUE;
            int right1 = (i < m) ? nums1[i] : Integer.MAX_VALUE;
            int left2 = (j > 0) ? nums2[j - 1] : Integer.MIN_VALUE;
            int right2 = (j < n) ? nums2[j] : Integer.MAX_VALUE;

            // partition is correct
            if (left1 <= right2 && left2 <= right1) {
                // even
                if (total % 2 == 0) {
                    result = (Math.max(left1, left2) + Math.min(right1, right2)) / 2.0;
                    // odd
                } else {
                    result = Math.max(left1, left2);
                }
                break;
            }
            // partition is wrong (update left/right pointers)
            else if (left1 > right2) {
                right = i - 1;
            } else {
                left = i + 1;
            }
        }

        return result;
    }
}
