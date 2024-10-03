package com.javaDigest.Oops.abstraction.test;


import com.javaDigest.Oops.abstraction.Animal;
import com.javaDigest.Oops.abstraction.Dog;

public class Test {
    public static void main(String[] args) {

//        Animal animal = new Animal() {
//            @Override
//            public void sayHello() {
//                System.out.println("say hello");
//            }
//        };


        // The below statement is giving us error. Reason is Animal is an abstract class. And abstract class can not be instantiated.
        // why? --> because in abstract class abstract methods can also be there. which can not be accessed if we create the object of abstract class.
//         Animal animal = new Animal();

        // Taking the reference of abstract class we are instantiating the child class.
        Animal dog = new Dog();
        dog.sayHello();

//        Dog myDog = (Dog) dog;
//        myDog.sayBye();             downcasting
    }
}
