package com.wust.factory.factoryMode;

import com.wust.factory.common.DrinksOperation;

/**
 * @author wxl
 * @date 2019/12/17
 * @description  工厂模式 - 定义工厂接口  每一个产品对应一个具体工厂实现类
 */
public interface FactoryModeFactory {

    DrinksOperation createDrinksOperation();

}
