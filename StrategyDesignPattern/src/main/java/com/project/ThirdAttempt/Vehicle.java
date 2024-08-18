package com.project.ThirdAttempt;

public class Vehicle {

    public FuelType fuelType;

    public String fuel(){
        return fuelType.display();
    }

    public void setVehicleFuelType(FuelType type){
        fuelType = type;
    }
}

