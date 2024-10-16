package com.javaDigest.interfaces.animals;

public class Test {
    public static void main(String[] args) {
//        Animal a = new Dog();
//        a.eat();
        Dog dog = new Dog();
        Cat cat =  new Cat();
        dog.bark();
        dog.myDefaultMethod();
        cat.myDefaultMethod();
        System.out.println("This is the static variable declared in interface using Class name. --> " + Dog.i);
        System.out.println("This is the static variable declared in interface using interface name. --> " + Animal.i);
        Animal.myStaticMethod();

    }
}
