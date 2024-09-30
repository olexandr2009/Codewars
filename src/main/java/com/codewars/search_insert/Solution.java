package com.codewars.search_insert;

public class Solution {
    public static int searchInsert(int[] nums, int target) {
        int high = 0;
        int min = 0;
        int i = (nums.length - high + min) / 2;
        int last = 0;
        for (;i!= last;i = (nums.length - high + min) / 2){
            if (nums[i] < target) {
                min = i;i--;
            } else if (nums[i] > target) {
                high = i;i++;
            } else {
                return i;
            }
            last=i;
        }
        return i;
    }

    public static void main(String[] args) {
        System.out.println(searchInsert(new int[]{1, 3, 5, 6}, 10));
    }
}
