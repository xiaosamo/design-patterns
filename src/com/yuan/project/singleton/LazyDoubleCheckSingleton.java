package com.yuan.project.singleton;

/**
 * @author yuan
 * @date 2019/3/29
 * @description 双重检查
 */
public class LazyDoubleCheckSingleton {
    private volatile static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton(){

    }

    public static LazyDoubleCheckSingleton getSingleton() {
        if (singleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (singleton == null) {
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
