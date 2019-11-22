package com.wust.algorithms.code15;

import java.util.*;

/**
 * @author wxl
 * @date 2019/11/21
 * @description
 */
public class ThreeSum {

    public static List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> result = new HashSet<>();
        int len = nums.length;
        if(nums == null || len < 3) {
            return new ArrayList<>(result);
        }
        //排序
        Arrays.sort(nums);
        if(nums[0] > 0 || nums[len-1] < 0){
            //数组全部大于0或者全部小于0
            return new ArrayList<>(result);
        }

        if(nums[0] == 0 && nums[len-1] == 0 ){
            if(nums[0] + nums[1] + nums[2] == 0){
                result.add(Arrays.asList(0,0,0));
                return new ArrayList<>(result);
            }
        }

        if(len == 3 ){
            if(nums[0] + nums[1] + nums[2] == 0){
                result.add(Arrays.asList(nums[0],nums[1],nums[2]));
                return new ArrayList<>(result);
            }
        }

        for(int i = 1; i <= len-2; i++){
            //双指针法
            for (int j = i-1,k = i+1; j >= 0 && k <= len-1; ) {
                int num = nums[i] + nums[j] + nums[k];
                if( num == 0){
                    result.add(Arrays.asList(nums[j],nums[i],nums[k]));

                    if(j == 0 && k == len-1){
                        break;
                    }

                    if(j > 0 ){
                        j--;
                        while(j > 0 && nums[j] == nums[j+1]){
                            j--;
                        }
                    }

                    if(k < len-1){
                        k++;
                        while( k < len-1 && nums[k] == nums[k-1]){
                            k++;
                        }
                    }

                }else if(num > 0){
                    if(j == 0){
                        //此时最小值大于0 跳出循环
                        break;
                    }else {
                        j--;
                    }
                }else {
                    if(k == len - 1){
                        //此时最大值小于0 跳出循环
                        break;
                    }else {
                        k++;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public static void main(String[] args) {

        int [] nums = new int[]{0,3,2,4,-3,-1,-4,-3,-3,2};
        System.out.println(threeSum(nums));
    }
}
