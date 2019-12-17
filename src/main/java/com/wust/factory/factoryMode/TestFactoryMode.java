package com.wust.factory.factoryMode;

import com.wust.factory.common.DrinksOperation;

/**
 * @author wxl
 * @date 2019/12/17
 * @description  测试工厂模式
 *
 * 工厂模式 需要多个工厂类，一般一个产品对应一个工厂类
 *      一个工厂类只做一件事，比如可乐工厂创建具体的可乐操作类 用于制作可乐
 *
 * 优点：
 *      工厂模式把简单工厂的内部逻辑判断转移到了不同产品的工厂实现类来进行，这也是工厂模式对简单工厂模式解耦的一个体现
 *      当需要制作橙汁的时候 满足开闭原则，只需要新增橙汁相关工厂实现类及其具体操作类即可
 *
 * 缺点：
 *      增加产品时 增加了额外开发量
 */
public class TestFactoryMode {

    public static void main(String[] args) {

        DrinksFactory colaDrinksFactory = new ColaDrinksFactoryImpl();
        DrinksOperation colaOperation = colaDrinksFactory.createOperation();
        colaOperation.makeDrinks();

        DrinksFactory spriteDrinksFactory = new SpriteDrinksFactoryImpl();
        DrinksOperation spriteOperation = spriteDrinksFactory.createOperation();
        spriteOperation.makeDrinks();

    }

}
