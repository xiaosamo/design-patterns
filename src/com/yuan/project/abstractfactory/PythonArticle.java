package com.yuan.project.abstractfactory;

/**
 * @author yuan
 * @date 2019/4/6
 * @description
 */
public class PythonArticle extends Article {
    @Override
    public void produce() {
        System.out.println("生产Python课程手记");
    }
}
