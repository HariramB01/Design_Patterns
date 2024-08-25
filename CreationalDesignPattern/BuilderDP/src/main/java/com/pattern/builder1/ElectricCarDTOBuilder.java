package com.pattern.builder1;

public class ElectricCarDTOBuilder implements CarDTOBuilder{


    private String model;
    private String engineType;
    private String batteryCapacity;
    private ElectricCarDTO dto;

    @Override
    public CarDTOBuilder withModel(String model) {
        this.model = model;
        return this;
    }

    @Override
    public CarDTOBuilder withEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }

    @Override
    public CarDTOBuilder withBatteryCapacity(String batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }

    @Override
    public CarDTOBuilder withFuelCapacity(String fuelCapacity) {
        // no-output, not used for Electric cars
        return this;
    }

    @Override
    public CarDTO build() {
        dto = new ElectricCarDTO(model, engineType, batteryCapacity);
        return dto;
    }
}
