package com.javaDigest.generics.boundedTypeParameters;

interface Printable {
    void print();
}

class MyNumber extends Number implements Printable {
    private final int value;

    public MyNumber(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println("MyNumber: " + value);
    }

    @Override
    public int intValue() {
        return value;
    }

    @Override
    public long longValue() {
        return value;
    }

    @Override
    public float floatValue() {
        return value;
    }

    @Override
    public double doubleValue() {
        return value;
    }
}
// Here to be noted is This T Generics type while instantiating will be a type which will extends Number and implement Printable
// And here in bounded type where we are defining multiple type and bounding it first would always be class and second would be interface
// or even if there would only be interface still we have to use extend only because here extend works only.

class Boxx<T extends Number & Printable>{
    private T item;

    public Boxx(T item) {
        this.item = item;
    }

    public void display() {
        item.print();
    }

    public T getItem() {
        return item;
    }
}

public class Test{
    public static void main(String[] args) {
        MyNumber myNumber = new MyNumber(12);
        Boxx<MyNumber> box = new Boxx<>(myNumber);
        // why <MyNumber> because MyNumber is there only which is extending here both Number and implementing printable.
        box.display();
    }
}
