package com.javaDigest.generics.generic_start;

// while implementing the interface we can define the type in the interface and accordingly we can set the data type for instance variables and overridden methods
public class StringContainer implements Container<String> {

    private String item;

    @Override
    public void add(String item) {
        this.item = item;
    }

    @Override
    public String get() {
        return item;
    }
}
