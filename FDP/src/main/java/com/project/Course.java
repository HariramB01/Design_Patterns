package com.project;

import java.util.ArrayList;
import java.util.List;

public abstract class Course {

    public List<Module> modules = new ArrayList<>();

    public Course(){
        this.createCourse();
    }

    public void getModules(){
       for(Module module : modules){
           System.out.println(module);
       }
    }


    public abstract void createCourse();

}
