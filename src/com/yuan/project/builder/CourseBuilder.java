package com.yuan.project.builder;

/**
 * @author yuan
 * @date 2019/3/30
 * @description
 */
public abstract class CourseBuilder {
    public abstract void  courseName(String courseName);
    public abstract void  coursePPT(String coursePPT);
    public abstract void  courseVideo(String courseVideo);
    public abstract void  courseArticle(String courseArticle);
    public abstract void  courseQA(String courseQA);

    public abstract Course makeCourse();
}
