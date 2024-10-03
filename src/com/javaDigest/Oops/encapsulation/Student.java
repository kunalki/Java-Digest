package com.javaDigest.Oops.encapsulation;

public class Student {

    // Inside a class which is a blueprint we have 2 things properties and behaviour
    // properties/field/instance-variable & behaviour
    // This below is instance variable which is outside all the methods.
    // This is related to class. From this class the instance/object that we will create this variable is the property of that.
    // behaviour is basically methods or which play with these instance variables.
    private String name;
    private int age;
    private int rollNumber;

    public void setAge(int age){
        if( age < 0){
            age = 0;
        }
        this.age = age;
        // this means on whatever we are calling this setMethod. We are referring that instance.
        // means when we call the method using reference var of the Student class object then this keyword refers to that object ref and set the value of the local var.
    }
    public int getAge(){
        return this.age;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public void setRollNumber(int rollNumber){
        if(rollNumber < 0){
            System.out.println("Invalid ROll Number");
        }else{
            this.rollNumber = rollNumber;
        }
    }
    public int getRollNumber(){
        return this.rollNumber;
    }



}

