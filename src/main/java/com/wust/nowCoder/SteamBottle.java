package com.wust.nowCoder;

/**
 * @author wxl
 * @date 2019/11/22
 * @description
 */
public class SteamBottle {

    public static void steamBottle(int kong){

        int he = 0;
        while(kong >= 3){

            //新换了几瓶
            int huan = kong/3;

            he = he + huan;

            kong = kong % 3 + huan;
        }
        if(kong == 2){
            he++;
        }
        System.out.println(he);
    }

    public static void main(String[] args) {
        steamBottle(3);
    }
}
