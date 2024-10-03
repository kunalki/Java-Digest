package com.javaDigest.Oops;

public class Car {
    private String color;
    private String model;
    private int year;
    private String brand;
    private int speed;


    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }

    public void setModel(String model){
        this.model =  model;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int increment){
        speed += increment;
    }
    public void brake(int decrement){
        speed -= decrement;
    }
}

