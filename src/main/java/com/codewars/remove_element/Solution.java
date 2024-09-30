package com.codewars.remove_element;

import java.util.Arrays;

public class Solution {
    public static int removeElement(int[] nums, int val) {
        int[] array = Arrays.stream(nums).filter(i -> i != val).toArray();
        System.arraycopy(array, 0, nums, 0, array.length);
        return array.length;
    }

}
