package com.javaDigest.generics.generic_start;

public class Box1<T> {
// This T type will be defined aat the time of this class instantiation.
// Instead of T we can give any single letter. But the convention is to give it as T with when we are passing single parameter.
//  This is basically placeholder which will get changed with the data type.

    private T value;

    public void setValue(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }

}
