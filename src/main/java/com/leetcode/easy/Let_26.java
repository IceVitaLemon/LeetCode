package com.leetcode.easy;

public class Let_26 {
    public static void main(String[] args){

    }

    public int method(int[] nums){
        int localMax = Integer.MIN_VALUE;
        int length = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > localMax){
                nums[length] = nums[i];
                length++;
                localMax = nums[i];
            }
        }
        return length;
    }
}
