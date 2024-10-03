package com.javaDigest.accessModifier.zoo;

public class Dog extends Animal {

    // if the extended class doesn't have any default constructor then subclass/child class will also have to create a constructor.
    public Dog(String name){
        super(name, "bark"); // This belongs to the immediate parent class.
    }

    public void wagtail(){
        System.out.println(getName() + " is wagging tail");
    }

    public String getName(){
        return getClass().getSimpleName();
    }

    public void setSound(String newSound){
        changeSound(newSound);
    }
}

