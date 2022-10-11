package com.patterns.observer.concreteObserver;

import com.patterns.observer.DisplayElement;
import com.patterns.observer.concreteSubject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private Observable weatherData;
    public ForecastDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }
    public void display() {
        System.out.println("Forecasted temperature: " + Float.sum(temperature, 11f)+ "F degrees and humidity : " + Float.sum(humidity, 12f) + "% humidity and pressure : "+ Float.sum(pressure, -11f));
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            this.pressure = weatherData.getPressure();
            display();
        }
    }
}
