package com.pattern.builder1;

public class FuelCarDTOBuilder implements CarDTOBuilder{


    private String model;
    private String engineType;
    private String fuelCapacity;
    private FuelCarDTO dto;

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
        // no-output , not used for fuel cars
        return this;
    }

    @Override
    public CarDTOBuilder withFuelCapacity(String fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
        return this;
    }

    @Override
    public CarDTO build() {
        dto = new FuelCarDTO(model, engineType, fuelCapacity);
        return dto;
    }
}
