package com.wust.factory.simpleFactory;

/**
 * @author wxl
 * @date 2019/12/17
 * @description  简单工厂模式 - 定义具体的操作类
 */
public class ColaDrinksImpl implements Drinks {

    @Override
    public void makeDrinks() {

        System.out.println("制作可乐饮料");
    }

}
