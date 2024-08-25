package com.project;

public class ExampleModule2 implements Module{

    public ExampleModule2(){
        display();
    }

    @Override
    public void display() {
        System.out.println("Example Module 2");
    }
}
