package com.pattern.builder;

public class Car {
    // Required fields
    private final String make;
    private final String model;

    // Optional fields
    private final int year;
    private final String color;


    // Private Constructor, so objects are only created via Builder
    private Car(CarBuilder builder){
        this.make = builder.make;
        this.model = builder.model;
        this.year = builder.year;
        this.color = builder.color;
    }

    // Static nested Builder class
    public static class CarBuilder{
        // Required fields
        private final String make;
        private final String model;

        // Optional fields
        private int year = 2020;
        private String color = "black";

        //Constructor for required fields
        public CarBuilder(String make, String model) {
            this.make = make;
            this.model = model;
        }

        // Setter methods for optional fields

        public CarBuilder setYear(int year) {
            this.year = year;
            return this;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        // Build method to create the car instance
        public Car build(){
            return new Car(this);
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }
}
