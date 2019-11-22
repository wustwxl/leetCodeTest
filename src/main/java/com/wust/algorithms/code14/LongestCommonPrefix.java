package com.wust.algorithms.code14;

/**
 * @author wxl
 * @date 2019/11/22
 * @description  14. 最长公共前缀  二分法
 */
public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        if(strs.length == 0 || strs == null){
            return "";
        }

        if(strs.length == 1 ){
            return strs[0];
        }

        //寻找最短字符串
        int minimum = Integer.MAX_VALUE;
        String minString = "";
        for (String str : strs) {
            if(str.length() <= minimum ){
                minString = str;
                minimum = str.length();
            }
        }

        //使用二分法查找
        String longest = "";
        //定义查找中间变量
        int start = 0;
        int end = minimum;

        //定义公共前缀(假定)
        int medium = (start+end)/2;
        String s = minString.substring(0,medium);
        while(start <= end){

            boolean result = true;
            for (int i = 0; i < strs.length; i++){

                if(!strs[i].startsWith(s)){
                    result = false;
                    break;
                }
            }

            if(result){
                //所有字符串都有此公共前缀
                longest = s;
                start = medium + 1 ;
                medium = (start + end)/2;
            }else{
                end = medium - 1 ;
                medium = (start + end)/2;
            }
            //重新假定公共前缀
            s = minString.substring(0,medium);
        }
        return longest;
    }

    public static void main(String[] args) {
        String [] strs = {"c","c"};

        System.out.println("...."+longestCommonPrefix(strs));
    }
}
