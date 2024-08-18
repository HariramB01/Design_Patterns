package com.project;

import com.project.stock.ConcreteStockObserver;
import com.project.stock.ConcreteStockSubject;
import com.project.stock.StockSubject;
import com.project.weather.CurrentConditionsDisplay;
import com.project.weather.WeatherData;

public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay();
        weatherData.attach(currentDisplay);

        weatherData.setMeasurements(25.5f, 65.0f, 1013.0f);
        weatherData.setMeasurements(27.0f, 70.0f, 1010.0f);


        ConcreteStockSubject stockSubject = new ConcreteStockSubject();

        ConcreteStockObserver stockObserver = new ConcreteStockObserver();

        stockSubject.attach(stockObserver);

        stockSubject.setData("Tata Steel",937);
        stockSubject.setData("Tata Communication",936);



    }
}
