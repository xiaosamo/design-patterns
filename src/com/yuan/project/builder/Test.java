package com.yuan.project.builder;

/**
 * @author yuan
 * @date 2019/3/31
 * @description
 */
public class Test {
    public static void main(String[] args) {
        // 创建builder
        CourseBuilder courseBuilder = new CourseActualBuilder();
        // 创建课程教练
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);

        Course course = coach.makeCourse("Java课程", "Java课程PPT", "Java课程Video", "Java课程Article", "Java课程QA");
        System.out.println(course);

    }
}
