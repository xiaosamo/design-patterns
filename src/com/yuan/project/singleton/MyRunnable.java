package com.yuan.project.singleton;

/**
 * @author yuan
 * @date 2019/3/29
 * @description
 */
public class MyRunnable implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getSingleton();
        System.out.println(Thread.currentThread().getName() + " " + lazySingleton);

    }
}
