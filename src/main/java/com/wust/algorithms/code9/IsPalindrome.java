package com.wust.algorithms.code9;

/**
 * @author wxl
 * @date 2019/11/21
 * @description 回文数
 */
public class IsPalindrome {

    public static boolean isPalindrome(int x) {

        if( x < 0){
            return false;
        }
        if (x < 10 ) {
            return true;
        }

        //取 数值 前半部分
        int revertedNumber = 0;
        while(x > revertedNumber){
            int yushu = x % 10;
            revertedNumber = revertedNumber * 10 + yushu;
            x = x / 10;
        }

        // 当数字长度为奇数时，我们可以通过 revertedNumber/10 去除处于中位的数字。
        // 例如，当输入为 12321 时，在 while 循环的末尾我们可以得到 x = 12，revertedNumber = 123，
        // 由于处于中位的数字不影响回文（它总是与自己相等），所以我们可以简单地将其去除。
        return (revertedNumber/10 == x) || (x == revertedNumber);
    }

    public static void main(String[] args) {

        int i = 121;
        System.out.println(isPalindrome(i));
    }
}
