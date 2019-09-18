package com.yuan.project.singleton;

/**
 * @author yuan
 * @date 2019/3/29
 * @description 静态内部类
 */
public class StaticInnerClassSingleton {
    private StaticInnerClassSingleton(){
    }

    private static class InnerClass{
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }

}
