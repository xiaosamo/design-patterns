package com.yuan.project.abstractfactory;

/**
 * @author yuan
 * @date 2019/4/6
 * @description
 */
public class JavaCourseFactory implements CourseFactory {
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
