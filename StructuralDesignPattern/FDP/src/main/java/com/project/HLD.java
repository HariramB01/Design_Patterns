package com.project;

public class HLD extends Course{
    @Override
    public void createCourse() {
        modules.add(new ExampleModule1());
        modules.add(new ExampleModule2());
    }
}
