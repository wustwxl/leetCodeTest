package com.wust.factory.factoryMode;

import com.wust.factory.common.ColaDrinksOperationImpl;
import com.wust.factory.common.DrinksOperation;

/**
 * @author wxl
 * @date 2019/12/17
 * @description  工厂模式 - 定义具体工厂实现类
 */
public class ColaDrinksFactoryImpl implements FactoryModeFactory {

    @Override
    public DrinksOperation createDrinksOperation() {
        return new ColaDrinksOperationImpl();
    }

}
