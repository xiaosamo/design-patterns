package com.yuan.project.builder.v2;

/**
 * @author yuan
 * @date 2019/3/31
 * @description
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course.CourseBuilder()
                .builderCourseName("Java课程")
                .builderCourseArticle("这是Java课程内容")
                .builderCoursePPT("Java PPT")
                .build();

        System.out.println(course);

    }
}
