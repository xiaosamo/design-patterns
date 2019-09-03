package com.yuan.project.singleton;

/**
 * @author yuan
 * @date 2019/3/29
 * @description 静态内部类
 */
public class StaticInnerClassSingleton {
    // 记得声明私有构造器，防止外部创建
    private StaticInnerClassSingleton(){

    }
    private static class InnerClass{
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.instance;
    }
}
