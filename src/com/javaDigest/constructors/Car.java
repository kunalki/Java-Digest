package com.javaDigest.constructors;

public class Car {
    private String name;
    private int age;

    //    public Car(){
//        this.name = "tata";
//        this.age = 5;
//    }
    public Car(String name, int age){// local variables of the constructor
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Text cannot be null or empty");
        } // instance variable me hum local variables ko daal rahe hai.
        this.age = age; // instance variable me hum local variables ko daal rahe hai.
    }
    public Car(String name){
        this.name = name;
    }
    public Car(int age){
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setAge(int age){
        this.age =  age;
    }

    public int getAge(){
        return this.age;
    }
}

