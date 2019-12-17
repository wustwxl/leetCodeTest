package com.wust.factory.simpleFactory;

import com.wust.factory.common.ColaDrinksOperationImpl;
import com.wust.factory.common.DrinksOperation;
import com.wust.factory.common.SpriteDrinksOperationImpl;

/**
 * @author wxl
 * @date 2019/12/17
 * @description  简单工厂模式 - 定义简单工厂类
 */
public class DrinksEasyFactory {

    public static final String COLA = "cola";
    public static final String SPRITE = "sprite";

    // 简单工厂，根据输入字符串创建相应的操作类
    public static DrinksOperation createOperation(String name) {
        DrinksOperation obj = null;
        switch (name) {
            case COLA:
                obj = new ColaDrinksOperationImpl();
                break;
            case SPRITE:
                obj = new SpriteDrinksOperationImpl();
                break;
        }
        return obj;
    }

}
