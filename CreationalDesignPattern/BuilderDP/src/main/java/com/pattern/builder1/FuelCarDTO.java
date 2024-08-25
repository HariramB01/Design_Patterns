package com.pattern.builder1;

public class FuelCarDTO implements CarDTO{

    private String model;
    private String engineType;
    private String fuelCapacity;

    public FuelCarDTO(String model, String engineType, String fuelCapacity) {
        this.model = model;
        this.engineType = engineType;
        this.fuelCapacity = fuelCapacity;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public String getEngineType() {
        return engineType;
    }

    @Override
    public String getBatteryCapacity() {
        return "Not applicable";
    }

    @Override
    public String getFuelCapacity() {
        return fuelCapacity;
    }

    @Override
    public String toString() {
        return "FuelCarDTO{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                ", fuelCapacity='" + fuelCapacity + '\'' +
                '}';
    }
}
