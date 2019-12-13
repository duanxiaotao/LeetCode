package com.leetcode.duan;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    private static int removeDuplicates(int[] nums) {
        //表示前一个数字的位置，i从第一个元素开始
        int i = 0;
        for(int j = 1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                //如果后一个元素不等于第一个元素，则指针后移一位
                i+=1;
                nums[i] = nums[j];
            }
        }
        return i+1;
    }
}
