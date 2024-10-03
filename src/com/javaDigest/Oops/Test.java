package com.javaDigest.Oops;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.setBrand("Maruti");
        car.setColor("Red");
        car.setSpeed(80);
        car.setModel("Dzire");
        System.out.println(car.getSpeed());
        car.accelerate(40);
        System.out.println(car.getModel());
        System.out.println(car.getBrand());
        System.out.println(car.getSpeed());
        car.brake(60);
        System.out.println(car.getSpeed());



    }
}

