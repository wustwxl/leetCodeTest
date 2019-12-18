package com.wust.singleton;

/**
 * @author wxl
 * @date 2019/12/18
 * @description 1、懒汉模式
 *     线程不安全,延迟初始化。
 */
public class LazybonesSingleton {

    // 持有自己类型的属性
    private static LazybonesSingleton instance;

    // 私有化构造函数
    private LazybonesSingleton (){}

    // 对外提供获取实例的静态方法
    public static LazybonesSingleton getInstance() {

        if (instance == null) {
            instance = new LazybonesSingleton();
        }
        return instance;
    }

}
