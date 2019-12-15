package com.leetcode.duan;

import java.util.Arrays;

public class PlusOne {
    //加1
    public static void main(String[] args) {
        int[] digits = new int[]{9,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));;
    }

    //如果首位是零，则首位扩充赋值1
    private static int[] plusOne(int[] digits) {
        int index = digits.length - 1;
        plusOne(digits, index);
        if(digits[0] == 0){
            int[] newDigits = new int[digits.length + 1];
            System.arraycopy(digits, 0, newDigits, 1, digits.length);
            newDigits[0] = 1;
            return newDigits;
        }
        return digits;
    }

    //递归加1
    private static void plusOne(int[] digits, int index){
        if(index < 0){
            return;
        }
        digits[index] += 1;
        if(digits[index] > 9){
            digits[index] = 0;
            index--;
            plusOne(digits, index);
        }
    }
}
