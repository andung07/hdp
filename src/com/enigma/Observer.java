package com.enigma;

import observer.CurrentConditionDisplay;
import observer.HistoryDisplay;
import observer.WeatherData;

public class Observer {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        HistoryDisplay historyDisplay = new HistoryDisplay(weatherData);

        weatherData.setMeasurements(10, 10, 1.1f);
    }
}
