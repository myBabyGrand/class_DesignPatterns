package com.patterns.observer.concreteObserver;

import com.patterns.observer.DisplayElement;
import com.patterns.observer.concreteSubject.WeatherData;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class StatisticsDisplay implements Observer, DisplayElement {
    private float temperature;
    private float humidity;
    private float pressure;
    private List<Float> temperatures;
    private List<Float> humidities;
    private List<Float> pressures;
    private Observable weatherData;
    public StatisticsDisplay(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
        setInitialData();
    }

    private void setInitialData() {
        temperatures = new ArrayList<>();
        humidities = new ArrayList<>();
        pressures = new ArrayList<>();
        temperatures.add(10f);
        temperatures.add(20f);
        temperatures.add(30f);
        humidities.add(30f);
        humidities.add(40f);
        humidities.add(50f);
        pressures.add(60.3f);
        pressures.add(70.7f);
        pressures.add(80.8f);
    }

    public void display() {
        System.out.println("Statistics data. average of temperature : "+getAverage(temperatures) +", humidity : "+getAverage(humidities)+", pressure : "+getAverage(pressures));
    }

    private String getAverage(List<Float> list) {
        Float sum = 0f;
        for (Float aFloat : list) {
            sum += aFloat;
        }
        return String.valueOf(sum/list.size());
    }

    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }
    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData)o;
            this.temperature = weatherData.getTemperature();
            temperatures.add(temperature);
            this.humidity = weatherData.getHumidity();
            humidities.add(humidity);
            this.pressure = weatherData.getPressure();
            pressures.add(pressure);
            display();
        }
    }
}
