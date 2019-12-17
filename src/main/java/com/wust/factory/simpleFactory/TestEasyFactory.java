package com.wust.factory.simpleFactory;

import com.wust.factory.common.DrinksOperation;

/**
 * @author wxl
 * @date 2019/12/17
 * @description  测试简单工厂  以制作可乐饮料跟雪碧饮料为例测试简单工厂
 *
 * 简单工厂只需要一个工厂类 通过输入的不同参数创建(即返回)不同的具体操作类(即实例对象)
 *
 * 优点：
 *      操作简单 容易理解
 *
 * 缺点：
 *      当需要制作其余的饮料时(比如橙汁) 则需要在增加 Drinks实现类 OrangeJuiceDrinksImpl 的基础上，
 *      修改工厂类 DrinksEasyFactory 的 createOperation 方法，违反了开-闭原则。
 *
 */
public class TestEasyFactory {

    public static void main(String[] args) {

        DrinksOperation cola = DrinksEasyFactory.createOperation(DrinksEasyFactory.COLA);
        cola.makeDrinks();

        DrinksOperation sprite = DrinksEasyFactory.createOperation(DrinksEasyFactory.SPRITE);
        sprite.makeDrinks();
    }
}
