package com.project;

import com.project.ThirdAttempt.*;
import com.project.firstAttempt.*;
import com.project.secondAttempt.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        Animal dog = new Dog();
        Animal bird = new Bird();

        System.out.println("Dog : "+dog.tryToFly());
        System.out.println("Bird : "+bird.tryToFly());

        dog.setFlyingAbility(new ItFly());

        System.out.println("Dog : "+dog.tryToFly());

        dog.setFlyingAbility(new CantFly());

        System.out.println("Dog : "+dog.tryToFly());


        System.out.println("---------------------------------");

        //payment


        PaymentContext context = new PaymentContext(new CreditCardPayment("5466-sdf4-sdf","harish"));
        context.pay(300.00);


        context.setPayment(new PayPalPayment("bhariram01@gmail.com"));
        context.pay(250);


        context.setPayment(new GooglePayPayment("6383561252"));
        context.pay(500);

        System.out.println("---------------------------------");

        //Vehicle

        Vehicle car = new Car();
        Vehicle bike = new Bike();
        Vehicle bicycle = new Bicycle();

        System.out.println(car.fuel());
        System.out.println(bike.fuel());
        System.out.println(bicycle.fuel());
        car.setVehicleFuelType(new Diesel());
        System.out.println(car.fuel());

    }
}