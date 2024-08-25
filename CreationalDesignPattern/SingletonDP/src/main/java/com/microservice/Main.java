package com.microservice;

import com.microservice.singleton.EagerSingleton;
import com.microservice.singleton.LazySingleton;

public class Main {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        eagerSingleton.showMessage();

        LazySingleton lazySingleton = LazySingleton.getInstance();
        lazySingleton.showMessage();

    }
}