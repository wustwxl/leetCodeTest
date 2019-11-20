package com.wust.algorithms.code1;

/**
 * @author wxl
 * @date 2019/11/20
 * @description
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++)
            {
                if(nums[i] == target - nums[j]){
                    return new int[]{i,j};
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;

        for (int num : twoSum(nums,target)) {
            System.out.println(num);
        }
    }
}
