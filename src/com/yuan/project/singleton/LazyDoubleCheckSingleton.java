package com.yuan.project.singleton;

/**
 * @author yuan
 * @date 2019/3/29
 * @description 双重检查
 */
public class LazyDoubleCheckSingleton {
    /**
     * volatile防止第2、3步重排序
     */
    private volatile static LazyDoubleCheckSingleton singleton = null;

    private LazyDoubleCheckSingleton(){
    }

    public static LazyDoubleCheckSingleton getSingleton() {
        if (singleton == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (singleton == null) {
                    /**
                     * singleton = new LazyDoubleCheckSingleton() 实际有3个步骤
                     * 1.分配内存给对象
                     * 2.初始化对象
                     * 3.设置singleton指向刚分配的内存地址
                     */
                    singleton = new LazyDoubleCheckSingleton();
                }
            }
        }
        return singleton;
    }
}
