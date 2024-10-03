package com.javaDigest.Oops.polymorphism.test;


import com.javaDigest.Oops.polymorphism.Animal;
import com.javaDigest.Oops.polymorphism.Cat;
import com.javaDigest.Oops.polymorphism.Dog;

public class Test {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sayHello();


        // =======================This is what we call Runtime Polymorphism.======================================
        // At the runtime it is being decided which method has to be executed. And it is achieved by method overriding.
        // In the reference if animal we are creating the object of Dog and when we are calling the sayHello method it is calling the overridden method
        // of Dog class Because JVM knows that u have created the Dog object with the reference of Animal class. As we know object is created at the runtime dynamically while executing the code.
        Animal dog = new Dog(); // upcasting
        dog.sayHello();


        Animal cat = new Cat();
        cat.sayHello();

//        Dog myDog = (Dog) dog; // because inside dog we have reference of Dog object only
//         // so we can say it is down casting.
//        myDog.sayHi();
//        myDog.sayHello();


    }
}

