package com.wust.singleton;

/**
 * @author wxl
 * @date 2019/12/18
 * @description  静态内部类单例模式(推荐)
 */
public class StaticInnerSingleton {

    // 持有自己类型的属性
    private static class InnerHolder {
        // 使用静态内部类
        static {
            // 只有通过显式调用 getInstance 方法时，才会显式装载 InnerHolder 类; 属于懒加载。
            System.out.println("加载静态内部类:静态内部类在使用的时候才会加载");
        }
        private static final StaticInnerSingleton INSTANCE = new StaticInnerSingleton();
    }

    // 私有化构造函数
    private StaticInnerSingleton (){
        System.out.println("私有化 StaticInnerSingleton 构造函数");
    }

    // 对外提供获取实例的静态方法
    public static final StaticInnerSingleton getInstance() {
        return InnerHolder.INSTANCE;
    }

    public static void main(String[] args) {

        new StaticInnerSingleton();
        System.out.println("此时并没有装载内部类 InnerHolder");

        System.out.println();
        System.out.println("开始显式调用 getInstance 方法");
        StaticInnerSingleton.getInstance();
        System.out.println("此时已装载内部类 InnerHolder");

        System.out.println();
        System.out.println("第二次调用 getInstance 方法, 静态内部类只会被装载一次, 从而保证单例。");
        StaticInnerSingleton.getInstance();
    }
}
