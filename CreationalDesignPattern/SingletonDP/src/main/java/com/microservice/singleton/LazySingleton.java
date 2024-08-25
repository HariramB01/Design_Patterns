package com.microservice.singleton;

public class LazySingleton {

    // private static instance, initially null
    private static LazySingleton instance;

    // private constructor to prevent instantiation
    private LazySingleton() {

    }

    // public method to provide access to the instance
    public static LazySingleton getInstance(){
        // check if the instance is null
        if(instance==null){
            // synchronized keyword helps to lock accessing the below method by multiple threads
            // It ensures only one thread can access the below method at a time
            synchronized (LazySingleton.class){
                // Double-check to avoid multiple instances
                if(instance==null){
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

    // Example method
    public void showMessage(){
        System.out.println("Lazy Singleton instance method called...");
    }

}
