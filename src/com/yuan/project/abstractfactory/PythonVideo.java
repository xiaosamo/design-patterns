package com.yuan.project.abstractfactory;

/**
 * @author yuan
 * @date 2019/4/1
 * @description
 */
public class PythonVideo extends Video {
    @Override
    public void produce() {
        System.out.println("录制Python课程");
    }
}
