package com.example.demo;

public abstract class Vehicle {

    private Integer num;

    protected abstract void start();
    protected abstract void stop();
    protected abstract void drive();
    protected abstract void changeGear();
    protected void reverse() {}

}
