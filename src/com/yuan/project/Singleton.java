package com.yuan.project;

/**
 * 单例模式
 * 应用场合：只需要一个对象就够了
 * 作用：保证整个应用程序某个实例只有一个
 * 类型：饿汉模式、懒汉模式
 */
//饿汉模式，只要类一加载类就有实例，不管你有没有调用。
public class Singleton {
    //1.将构造方法设为私有，不允许外部直接创建对象
    private Singleton(){

    }

    //2.创建类的唯一实例,使用private static
    private static Singleton instance = new Singleton();

    //3.提供一个获取实例的方法,使用public static
    public static Singleton getInstance(){
        return instance;
    }

}
