package com.yuan.project.singleton;

/**
 * @author yuan
 * @date 2019/3/29
 * @description 懒汉模式
 * sync实现线程安全
 */
public class LazySingleton2 {
    private static LazySingleton2 singleton = null;

    private LazySingleton2(){

    }

    public synchronized static LazySingleton2 getSingleton(){
        if (singleton == null) {
            singleton =  new LazySingleton2();
        }
        return singleton;
    }

}
