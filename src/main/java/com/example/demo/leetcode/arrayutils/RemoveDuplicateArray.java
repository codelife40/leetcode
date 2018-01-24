package com.example.demo.leetcode.arrayutils;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by longmu on 23/01/2018.
 */
public class RemoveDuplicateArray {

    public static int removeDuplicates(int[] nums) {
        int newLength = 0;
        if (nums != null && nums.length > 0) {
            newLength = 1;
            for (int i = 1; i < nums.length; i++) {
                if (nums[i] != nums[i - 1]) {
                    nums[newLength] = nums[i];
                    newLength++;
                }
            }
        } else if (nums !=null) {

        }
        System.out.println(StringUtils.join(nums,';'));
        return newLength;
    }

    public static void main(String[] args) {

        
        int len = removeDuplicates(new int[]{1,1,1,2,2,3});
        System.out.println(len);


    }


}


