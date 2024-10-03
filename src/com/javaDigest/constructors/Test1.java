package com.javaDigest.constructors;

public class Test1 {
    public static void main(String[] args) {
//        Car car = new Car();
        Car car1 = new Car("", 2);
        Car car2 = new Car(5);
        Car car3 = new Car("Mahindra");

//        car.setName("maruit");
//        car1.setName("Hyundai");
//        System.out.println(car.getName());
//        System.out.println(car.getAge());
        System.out.println(car1.getName());
        System.out.println(car1.getAge());


    }
}
