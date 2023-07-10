package com.fabiocarlesso.arrayshashing;

public class NumArray {
    private final int[] arr;
    public NumArray(int[] nums) {
        arr=nums;
        for(int i=1;i<arr.length;i++)
            arr[i]+=arr[i-1];
    }

    public int sumRange(int left, int right) {
        if(left==0)
            return arr[right];
        return arr[right]-arr[left-1];
    }
}
