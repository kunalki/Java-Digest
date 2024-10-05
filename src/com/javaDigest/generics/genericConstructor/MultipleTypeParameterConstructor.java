package com.javaDigest.generics.genericConstructor;

public class MultipleTypeParameterConstructor {
    // Generic constructor with two type parameters
    <A, B> MultipleTypeParameterConstructor(A first, B second) {
        System.out.println("First: " + first + ", Second: " + second);
    }
}

class Main {
    public static void main(String[] args) {
        new MultipleTypeParameterConstructor(10, "Ten");  // Integer and String
        new MultipleTypeParameterConstructor(3.14, 42);   // Double and Integer
    }
}
