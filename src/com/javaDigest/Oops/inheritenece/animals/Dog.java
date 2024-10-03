package com.javaDigest.Oops.inheritenece.animals;

public class Dog extends Animal {

    // here just because Dog is inheriting Animal by extending Animal Therefore the properties of the Animal applies here automatically like name and age
    // so here we don't need to repeat the code.

    @Override
    public void sayHello(){
        System.out.println("woof!!");
    }
}

