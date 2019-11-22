package com.wust.nowCoder;

/**
 * @author wxl
 * @date 2019/11/22
 * @description 爬楼梯
 */
public class ClimbStairs {

    static int stair(int n){
        if( n == 0 ) {
            return 1;
        }
        if( n == 1 ) {
            return 1;
        }
        return stair( n-1 ) + stair( n-2 );
    }

    public static void main(String[] args) {
        System.out.println(stair(5));
    }
}
