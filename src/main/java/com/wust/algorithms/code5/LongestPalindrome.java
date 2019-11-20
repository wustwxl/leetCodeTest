package com.wust.algorithms.code5;

/**
 * @author wxl
 * @date 2019/11/20
 * @description  回文子串是正读和反读都相同的字符串
 */
public class LongestPalindrome {

    public static String longestPalindrome(String s) {

        String maxPal = "";
        int maxLen = 0;

        int length = s.length();

        boolean isTrue[][] = new boolean[length][length];

        for (int len = 1; len <= length; len++) {
            for (int start = 0 ; start < length; start++) {

                int end = start + len - 1;
                if(end >= length){
                    break;
                }

                isTrue[start][end] = (len == 1 || len == 2 || isTrue[start+1][end-1] ) && (s.charAt(start) == s.charAt(end));
                if(isTrue[start][end] && len > maxLen){
                    //maxLen = len;
                    maxPal = s.substring(start,end+1);
                }
            }
        }

        return maxPal;
    }

    public static void main(String[] args) {

        String s = "cbbd";
        System.out.println(longestPalindrome(s));
    }
}
