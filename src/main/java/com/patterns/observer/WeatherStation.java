package com.patterns.observer;

import com.patterns.observer.concreteObserver.CurrentConditionDisplay;
import com.patterns.observer.concreteObserver.ForecastDisplay;
import com.patterns.observer.concreteObserver.StatisticsDisplay;
import com.patterns.observer.concreteSubject.WeatherData;

public class WeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
