package com.design.observer;

public class TvDisplay implements IObserver{

    private float temperature;

    private float humidity;

    @Override
    public void update(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void display() {
        System.out.println("TV Display Temperature: " + temperature + "C Humidity: " + humidity);
    }
}
