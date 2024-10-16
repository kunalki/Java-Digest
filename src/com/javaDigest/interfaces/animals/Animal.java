package com.javaDigest.interfaces.animals;

public interface Animal {
     int i = 10; // here writing static is not required.

    public void eat();

//     static method with full implementation introduced in java 8
    static void myStaticMethod(){
        System.out.println("This is a static method declared in interface.");
    }

//    default method with full implementation introduced in java 8
    default void myDefaultMethod(){
        this.eat();
        System.out.println("This is a default method declared in interface.");
    }
}
