package com.wust.factory.common;

/**
 * @author wxl
 * @date 2019/12/17
 * @description
 */
public class CakeFoodOperation implements FoodOperation{

    @Override
    public void makeFood() {

        System.out.println("制作蛋糕食品");
    }

}