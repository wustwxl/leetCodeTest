package com.wust.algorithms.code3;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wxl
 * @date 2019/11/20
 * @description
 */
public class LengthOfLongestSubstring {

    public static int lengthOfLongestSubstring(String s) {
        //假设 i 为左边计算点， j 为右边计算点，num 用于计算长度。
        int i = 0, j = 0, num = 0;
        //字符串长度
        int length = s.length();
        //用于存放字符串
        Set<Character> characterSet = new HashSet<Character>();
        while( i < length && j < length){
            if( ! characterSet.contains(s.charAt(j))){
                //set中不存在的话 将其放入set
                characterSet.add(s.charAt(j));
                //计算长度  取大值
                num = Math.max(num,j - i + 1);
                //继续向下匹配
                j++;
            }else{
                //set中存在该字符 删除之前的
                characterSet.remove((s.charAt(i)));
                i++;
            }
        }
        return num;
    }

    public static void main(String[] args) {

        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s1));
        System.out.println(lengthOfLongestSubstring(s2));
        System.out.println(lengthOfLongestSubstring(s3));
    }
}
