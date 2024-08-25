package com.microservice.singleton;

public class EagerSingleton {

    // create the instance at the time of class loading
    private static final EagerSingleton instance = new EagerSingleton();

    // private constructor to prevent instantiation
    private EagerSingleton(){

    }

    // Example method
    public static EagerSingleton getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Eager Singleton instance method called");
    }

}
