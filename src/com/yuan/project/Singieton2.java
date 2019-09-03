package com.yuan.project;

/**
 * 懒汉模式
 * 区别：饿汉模式，加载慢，但运行时获取对象速度比较快，线程安全
 *      懒汉模式，加载类时比较快，但是获取对象速度比较慢，线程不安全
 */
public class Singieton2 {
    //1.将构造方法设为私有，不允许外部直接创建对象
    private Singieton2(){

    }

    //2.声明类的唯一实例,注意没有实例花
    private static Singieton2 instance;

    //3.提供一个获取实力的方法
    public static Singieton2 getInstance(){
        if (instance == null) {
            instance = new Singieton2();
        }
        return instance;
    }

}
