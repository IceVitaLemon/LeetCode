package com.leetcode.easy;

public class Let_27 {
    public static void main(String[] args){

    }

    public int method(int[] nums, int val){
        int length = 0;
        int end = nums.length;

        while (length != end){
            if (nums[length] != val){
                length++;
            }else if (nums[end - 1] != val){
                nums[length++] = nums[--end];
            }else {
                end--;
            }
        }
        return length;
    }
}
