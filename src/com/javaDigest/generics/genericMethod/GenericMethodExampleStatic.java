package com.javaDigest.generics.genericMethod;

public class GenericMethodExampleStatic {
    // Generic static method
    public static <T> void printElement(T element) {
        System.out.println("Element: " + element);
    }

    public static void main(String[] args) {
        GenericMethodExampleStatic.printElement(42); // Output: Element: 42
        GenericMethodExampleStatic.printElement("Generics in Java"); // Output: Element: Generics in Java
    }
}
