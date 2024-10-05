package com.javaDigest.generics.generic_start;

//  here in the class also we pass the generic type parameter.
// while instantiating the GenericsContainer we can pass the data type and T will be replaced to that.
// here we can pass the multiple parameter as well having the same no of parameters in interface as well
public class GenericsContainer <T> implements Container<T> {


    private T item;

    @Override
    public void add(T item) {
       this.item = item;
    }

    @Override
    public T get() {
        return item;
    }
}
