package com.leetcode.duan;

import java.util.Arrays;

public class Rotate {
    //翻转
    public static void main(String[] args) {
        int[] nums = new int[] {1,2,3,4,5,6,7};
        rotate(nums, 10);
        System.out.println(Arrays.toString(nums));
    }

    private static void rotate(int[] nums, int k) {
        int length = nums.length;
        //循环大于一轮的情况下取余数
        k = k % length;
        for(int i = 1; i<= k; i++){
            int temp = nums[length - 1];
            for(int j = length - 1; j > 0; j--){
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }
}
