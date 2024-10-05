package com.javaDigest.generics.generic_start;

public class MainForGenereicContainer {
    public static void main(String[] args) {
        GenericsContainer<String> gc = new GenericsContainer<>();
        gc.add("Hello world");
        System.out.println(gc.get());
    }
}
