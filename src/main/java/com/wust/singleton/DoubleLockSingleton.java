package com.wust.singleton;

/**
 * @author wxl
 * @date 2019/12/18
 * @description 3、双重锁模式
 *     线程安全,延迟初始化。
 *     进行两次判断,第一次是为了避免不必要的上锁;第二次是为了进行同步,避免多线程问题。
 */
public class DoubleLockSingleton {

    // 持有自己类型的属性
    private volatile static DoubleLockSingleton instance;

    // 私有化构造函数
    private DoubleLockSingleton (){}

    // 对外提供获取实例的静态方法
    public static DoubleLockSingleton getInstance() {

        // 第一次是为了避免不必要的上锁
        if (instance == null) {
            synchronized (DoubleLockSingleton.class) {
                // 第二次是为了进行同步,避免多线程问题
                if (instance == null) {
                    instance = new DoubleLockSingleton();
                }
            }
        }
        return instance;
    }

}
