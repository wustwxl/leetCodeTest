package com.wust.algorithms.code6;

/**
 * @author wxl
 * @date 2019/11/20
 * @description
 */
public class Convert {

    public static String convert(String s, int numRows) {

        StringBuilder sb = new StringBuilder();

        int i = 0;
        while (i < numRows){

            int cishu = 0;
            int fubiao = (2*numRows-2);
            for (int j = i; j < s.length(); j = j + fubiao){

                sb.append(s.charAt(j));

                if(i != 0 || i != (numRows -1)){

                    if(cishu == 1){
                        fubiao = (2*numRows-2) - 2*i;
                        cishu = 0;
                    }else {
                        fubiao = (2*numRows-2) + j + i;
                        cishu = 1;
                    }
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
