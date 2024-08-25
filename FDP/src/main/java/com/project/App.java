package com.project;

public class App 
{
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        Course hldCourse = CourseFactory.getCourse("HLD");
        System.out.println("-------------------");
        Course lldCourse = CourseFactory.getCourse("LLD");

        assert hldCourse!=null;
        System.out.println("HLD modules");
        System.out.println(hldCourse.modules);
        hldCourse.getModules();


        assert lldCourse!=null;
        System.out.println("LLD modules");
        System.out.println(lldCourse.modules);

    }
}
