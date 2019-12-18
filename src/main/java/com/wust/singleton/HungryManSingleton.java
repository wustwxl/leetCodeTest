package com.wust.singleton;

/**
 * @author wxl
 * @date 2019/12/18
 * @description 2、饿汉模式
 *     线程安全,比较常用;
 *     类加载时就初始化,浪费内存。
 */
public class HungryManSingleton {

    // 持有自己类型的属性
    private static HungryManSingleton instance = new HungryManSingleton();

    // 私有化构造函数
    private HungryManSingleton (){}

    // 对外提供获取实例的静态方法
    public static HungryManSingleton getInstance() {
        return instance;
    }
}
