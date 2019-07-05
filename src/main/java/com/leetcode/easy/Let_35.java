package com.leetcode.easy;

public class Let_35 {
    public static void main(String[] args){
        int[] nums = {1, 3, 5, 6};
        Let_35 search = new Let_35();
        search.searchInsert(nums, 0);
    }

    public int searchInsert(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;

         while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] > target){
                end = mid - 1;
            }else if (nums[mid] < target){
                start = mid + 1;
            }else {
                return mid;
            }
         }
         if (end == -1){
             return 0;
         }
         if (nums[end] > target){
             return end;
         }else {
             return end + 1;
         }
    }
}
