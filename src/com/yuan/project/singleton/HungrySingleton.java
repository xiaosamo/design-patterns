package com.yuan.project.singleton;

import java.io.Serializable;

/**
 * @author yuan
 * @date 2019/3/29
 * @description 饿汉模式
 * 线程安全
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton instance = new HungrySingleton();
    private HungrySingleton(){
    }

    public static HungrySingleton getInstance(){
        return instance;
    }

}
