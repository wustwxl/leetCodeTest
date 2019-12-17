package com.wust.factory.abstractFactory;

import com.wust.factory.common.DrinksOperation;
import com.wust.factory.common.FoodOperation;

/**
 * @author wxl
 * @date 2019/12/17
 * @description  抽象模式 - 定义工厂接口  一个工厂可以生产多种产品，抽象工厂强调的是产品簇的概念
 *
 * 比如说 抽象工厂中的小米工厂生产一系列小米产品（比如 平板 手机等）
 * 而工厂模式不关心你的产品簇 使用工厂模式也就意味着该工厂只生产一种产品
 */
public interface AbstractFactory {

    DrinksOperation createDrinksOperation();

    FoodOperation createFoodOperation();

}
