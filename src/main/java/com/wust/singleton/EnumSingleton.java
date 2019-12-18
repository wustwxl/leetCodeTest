package com.wust.singleton;

import java.io.Serializable;

/**
 * @author wxl
 * @date 2019/12/18
 * @description 5、枚举单例模式(推荐:简单,但可读性差。)
 *     默认枚举实例的创建是线程安全的,并且在任何情况下都是单例。
 *     如果涉及到反序列化创建对象时,可以尝试使用枚举方式。
 */
public enum EnumSingleton implements Serializable {

    INSTANCE;

    /*
     * @author wxl
     * @date 2019/12/18
     * @description  防止序列化/反序列化破坏单例模式
     *
     * 通过对 EnumSingleton 的序列化与反序列化得到的对象是一个新的对象,这就破坏了Singleton的单例性。
     * 当实例被写入到文件要反序列化成实例时,因为序列化会通过反射调用无参数的构造方法创建一个新的对象,
     * 所以需要重写readResolve方法,以让实例唯一。
     */
    private Object readResolve() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        EnumSingleton singletonClass = EnumSingleton.INSTANCE;
    }
}
