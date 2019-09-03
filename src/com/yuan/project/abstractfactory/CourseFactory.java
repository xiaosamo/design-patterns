package com.yuan.project.abstractfactory;

/**
 * @author yuan
 * @date 2019/4/6
 * @description 课程的抽象工厂
 */
public interface CourseFactory {
    Video getVideo();

    Article getArticle();

}
