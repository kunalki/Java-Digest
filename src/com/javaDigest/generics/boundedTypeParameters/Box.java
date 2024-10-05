package com.javaDigest.generics.boundedTypeParameters;

// Bounded Type Parameter means here while passing the T which is a generic type will either extend or implement an interface.
//  Now here Number is a super class of all the wrapper classes which comes under Number category. like Long Integer Float Double
public class Box <T extends Number> {

    private T item;

    public void setItem(T item){
        this.item = item;
    }

    public T getItem(){
        return item;
    }
}
