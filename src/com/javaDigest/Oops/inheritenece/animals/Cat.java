package com.javaDigest.Oops.inheritenece.animals;

public class Cat extends Animal{

    @Override // This @Override annotation is option to use, But it's good practice.
    public void sayHello(){
        System.out.println("Meow!!");
    }
}

