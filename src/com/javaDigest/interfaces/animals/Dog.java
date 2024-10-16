package com.javaDigest.interfaces.animals;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
    public void bark(){
        System.out.println("I am barking.");
        }

}
