package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements ISubject {

    private List<IObserver> observerList;

    private float temperature;

    private float humidity;

    public WeatherData() {
        observerList = new ArrayList<>();
        temperature = 37.0f;
        humidity = 40f;
    }

    @Override
    public void registerObserver(IObserver observer) {
        if (!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void removeObserver(IObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observerList) {
            observer.update(temperature, humidity);
        }
    }

    public void measurementChange() {
        notifyObservers();
    }

    public void updateMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        measurementChange();
    }
}
