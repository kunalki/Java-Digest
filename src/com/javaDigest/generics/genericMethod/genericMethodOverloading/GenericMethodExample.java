package com.javaDigest.generics.genericMethod.genericMethodOverloading;

public class GenericMethodExample {
    public <T> void display(T element) {
        System.out.println("Generic display: " + element);
    }

    public void display(Integer element) {
        System.out.println("Integer display: " + element);
    }

    public static void main(String[] args) {
        GenericMethodExample example = new GenericMethodExample();

        example.display(42);         // Calls the Integer display method
        example.display("Generics"); // Calls the generic display method
    }
}
