package com.pattern.builder1;

public class ElectricCarDTO implements CarDTO{

    private String model;
    private String engineType;
    private String batteryCapacity;

    public ElectricCarDTO(String model, String engineType, String batteryCapacity) {
        this.model = model;
        this.engineType = engineType;
        this.batteryCapacity = batteryCapacity;
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
        return batteryCapacity;
    }

    @Override
    public String getFuelCapacity() {
        return "Not applicable";
    }

    @Override
    public String toString() {
        return "ElectricCarDTO{" +
                "model='" + model + '\'' +
                ", engineType='" + engineType + '\'' +
                ", batteryCapacity='" + batteryCapacity + '\'' +
                '}';
    }
}
