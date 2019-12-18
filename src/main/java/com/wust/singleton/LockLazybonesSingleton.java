package com.wust.singleton;

/**
 * @author wxl
 * @date 2019/12/18
 * @description 1.1、加锁式懒汉模式
 *     线程安全,延迟初始化,加锁 synchronized 保证单例。
 */
public class LockLazybonesSingleton {

    // 持有自己类型的属性
    private static LockLazybonesSingleton instance;

    // 私有化构造函数
    private LockLazybonesSingleton (){}

    // 对外提供获取实例的静态方法
    public static synchronized LockLazybonesSingleton getInstance() {

        if (instance == null) {
            instance = new LockLazybonesSingleton();
        }
        return instance;
    }
}
