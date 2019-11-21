package com.wust.algorithms.code12;

/**
 * @author wxl
 * @date 2019/11/21
 * @description
 */
public class IntToRoman {

    public static String intToRoman(int num) {

        // 罗马数字
        String[] romanArray = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        // 阿拉伯数字
        int[] intArray = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        int len = intArray.length;
        StringBuilder result = new StringBuilder();
        for (int i = 0 ; i < len; ){

            if(num >= intArray[i]){
                result.append(romanArray[i]);
                num = num - intArray[i];
            }else{
                i++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {

        int i = 58;
        System.out.println(intToRoman(i));
    }
}
