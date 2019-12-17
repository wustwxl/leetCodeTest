package com.wust.factory.simpleFactory;

/**
 * @author wxl
 * @date 2019/12/17
 * @description  简单工厂模式 - 定义简单工厂类
 */
public class DrinksEasyFactory {

    public static final String COLA = "cola";
    public static final String SPRITE = "sprite";

    // 简单工厂，根据输入字符串创建相应的操作类
    public static Drinks createOperation(String name) {
        Drinks obj = null;
        switch (name) {
            case COLA:
                obj = new ColaDrinksImpl();
                break;
            case SPRITE:
                obj = new SpriteDrinksImpl();
                break;
        }
        return obj;
    }

}
