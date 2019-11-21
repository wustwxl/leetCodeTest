package com.wust.algorithms.code7;

/**
 * @author wxl
 * @date 2019/11/21
 * @description
 */
public class Reverse {

    public static int reverse(int x) {
        int result = 0;

        while(x != 0){
            int yushu = x%10;
            x = x/10;

            //以防越界 使用long接收下一值  注意需要 加 L
            long test = result*10L + yushu;

            if(  test> Integer.MAX_VALUE){
                //溢出
                return 0;
            }
            if( test < Integer.MIN_VALUE){
                //溢出
                return 0;
            }
            result = result*10 + yushu;

        }
        return result;
    }

    public static void main(String[] args) {

        int x = 1534236469;
        System.out.println(reverse(x));

        int i = 964632435;
        int test = i*10+1;
        System.out.println(test);

    }
}
