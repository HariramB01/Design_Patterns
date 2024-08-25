package com.project;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class UserActionSubject {

    private List<Observer> observers = new CopyOnWriteArrayList<>();


    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void detach(Observer observer){
        observers.remove(observer);
    }

    public void notifyObservers(String action, String user){
        for(Observer ob : observers){
            ob.update(action, user );
        }
    }

}
