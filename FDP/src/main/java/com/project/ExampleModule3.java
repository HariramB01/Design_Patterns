package com.project;

public class ExampleModule3 implements Module{

    public ExampleModule3(){
        display();
    }

    @Override
    public void display() {
        System.out.println("Example Module 3");
    }
}
