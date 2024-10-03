package com.javaDigest.Oops.inheritenece.humans;

public class Child extends Parent {

    public Child(String name, int age) {
        super(name, age); // means child's parent class and bracket means constructor parent class constructor. well, we don't need to explicitly call it.
        // it's implicitly hidden here. super parent refers immediate parent.
        System.out.println("Child Constructor called");
    }

    public void childMethod(){
        System.out.println("Child method called");
        super.parentMethod();
    }

}

