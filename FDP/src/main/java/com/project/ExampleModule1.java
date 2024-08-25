package com.project;

public class ExampleModule1 implements Module{

    public ExampleModule1(){
        display();
    }

    @Override
    public void display() {
        System.out.println("Example Module 1");
    }
}
