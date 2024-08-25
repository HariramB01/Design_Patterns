package com.pattern.builder1;

public interface CarDTOBuilder {

    CarDTOBuilder withModel(String model);
    CarDTOBuilder withEngineType(String engineType);
    CarDTOBuilder withBatteryCapacity(String batteryCapacity);
    CarDTOBuilder withFuelCapacity(String fuelCapacity);
    CarDTO build();

}
