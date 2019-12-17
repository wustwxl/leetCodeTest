package com.wust.factory.factoryMode;

import com.wust.factory.common.DrinksOperation;
import com.wust.factory.common.SpriteDrinksOperationImpl;

/**
 * @author wxl
 * @date 2019/12/17
 * @description  工厂模式 - 定义具体工厂实现类
 */
public class SpriteDrinksFactoryImpl implements DrinksFactory {

    @Override
    public DrinksOperation createOperation() {
        return new SpriteDrinksOperationImpl();
    }

}