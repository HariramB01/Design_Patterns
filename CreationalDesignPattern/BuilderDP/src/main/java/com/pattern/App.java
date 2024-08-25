package com.pattern;


import com.pattern.builder.Car;
import com.pattern.builder1.CarDTO;
import com.pattern.builder1.CarDTOBuilder;
import com.pattern.builder1.ElectricCarDTOBuilder;
import com.pattern.builder1.FuelCarDTOBuilder;

public class App
{
    public static void main( String[] args ) {

//        URLBuilder.Builder builder = new URLBuilder.Builder();
//        builder.protocol("http://").hostname("localhost").port("8080");
//        URLBuilder urlBuilder = builder.build();
//        System.out.print(urlBuilder.protocol);
//        System.out.print(urlBuilder.hostname);
//        System.out.print(urlBuilder.port);


//        System.out.println( "---------------------------------------------------------" );
//
//        Car car = new Car.CarBuilder("Toyota","Camry")
//                .setYear(2023)
//                .setColor("Red")
//                .build();
//
//        System.out.println(car);


        System.out.println( "---------------------------------------------------------" );

        // builder1

        CarDTOBuilder electricBuilder = new ElectricCarDTOBuilder();
        CarDTO electricCar = directBuild(electricBuilder, "Tesla Model S", "Electric", "100 KWh", null);
        System.out.println(electricCar);

        CarDTOBuilder fuelBuilder = new FuelCarDTOBuilder();
        CarDTO fuelCar = directBuild(fuelBuilder, "Tesla Model S", "Electric", "null", "60 liters");
        System.out.println(electricCar);


    }

    private static CarDTO directBuild(CarDTOBuilder builder, String model, String engineType, String batteryCapacity, String fuelCapacity) {
        builder.withModel(model).withEngineType(engineType);
        if(batteryCapacity!=null) builder.withBatteryCapacity(batteryCapacity);
        if(fuelCapacity!=null) builder.withFuelCapacity(fuelCapacity);
        return builder.build();
    }

    /*
    *
    * The builder pattern can be implemented in two different ways
    * 1. with nested static public builder class
    * 2. with or without director
    *
    *
    *
    *
    * */
}
