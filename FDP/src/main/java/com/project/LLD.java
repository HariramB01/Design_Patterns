package com.project;

public class LLD extends Course{
    @Override
    public void createCourse() {
        modules.add(new ExampleModule3());
        modules.add(new ExampleModule4());
    }
}
