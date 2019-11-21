package com.wust.algorithms.code11;

/**
 * @author wxl
 * @date 2019/11/21
 * @description
 */
public class MaxArea {

    public static int maxArea(int[] height) {

        int max = 0;
        int j = height.length - 1;
        for (int i = 0; i < j; ) {

            //高 取较小值
            if(height [i] < height [j]){
                max = (j-i)*height[i] > max ? (j-i)*height[i] : max;
                i++;
            }else {
                max = (j-i)*height[j] > max ? (j-i)*height[j] : max;
                j--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int nums[] = new int [] {
                1,8,6,2,5,4,8,3,7
        };

        System.out.println(maxArea(nums));
    }

}
