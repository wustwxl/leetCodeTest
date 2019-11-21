package com.wust.algorithms.code6;

/**
 * @author wxl
 * @date 2019/11/20
 * @description
 */
public class Convert {

    public static String convert(String s, int numRows) {

        if (numRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int jiange = (2*numRows-2);

        int i = 0;
        while (i < numRows){

            //第一行 和最后一行
            for (int j = i; j < s.length(); j++) {
                if ((i == 0 || i == (numRows - 1)) && (j % jiange) == i) {
                    sb.append(s.charAt(j));
                } else if ((j % jiange) == i || (j % jiange) == (jiange - i)) {
                    //中间行
                    sb.append(s.charAt(j));
                }
            }
            i++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String s = "LEETCODEISHIRING";
        int numRows = 4;

        String result = "LDREOEIIECIHNTSG";
        System.out.println(convert(s,numRows));
        System.out.println(result.equalsIgnoreCase(convert(s,numRows)));
    }

}
