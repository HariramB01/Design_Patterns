package com.project.firstAttempt;

public class Animal {

    public Fly flyingType;

    public String tryToFly(){
        return flyingType.fly();
    }

    public void setFlyingAbility(Fly newFlyType){
        flyingType = newFlyType;
    }

}


/*

Avoid interfaces that just force action

using an interface just to force the creation of a method is a bad idea


Behavior can change without side effects

The behavior isn't tide to the superclass or subclasses

 */