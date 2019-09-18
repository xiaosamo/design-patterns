package com.yuan.project.singleton;

import java.io.Serializable;

/**
 * @author yuan
 * @date 2019/3/29
 * @description 饿汉模式
 * 线程安全
 */
public class HungrySingleton2 implements Serializable {
    private final static HungrySingleton2 hungrySingleton = new HungrySingleton2();
    private HungrySingleton2(){
        if (hungrySingleton == null) {
            throw new RuntimeException("单例模式禁止调用反射");
        }
    }

    public static HungrySingleton2 getHungrySingleton(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }

}
