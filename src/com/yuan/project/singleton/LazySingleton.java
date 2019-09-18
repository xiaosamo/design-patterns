package com.yuan.project.singleton;

/**
 * @author yuan
 * @date 2019/3/29
 * @description 懒汉模式
 * 线程不安全
 */
public class LazySingleton {
    private static LazySingleton singleton = null;

    private LazySingleton(){
    }

    public static LazySingleton getSingleton() {
        if (singleton == null) {
            singleton = new LazySingleton();
        }
        return singleton;
    }

}
