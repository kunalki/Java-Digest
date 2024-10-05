package com.javaDigest.generics.boundedTypeParameters;

public class Main {
    public static void main(String[] args) {
        /*

         Box<String> box = new Box<>(); // if we pass String it will give compile time error.
         That we should pass something which is extending Number class like Integer Long Float Double

        */
        Box<Integer> box = new Box<>(); // no error
        Box<Double> box1  = new Box<>(); // no error
        Box<Float> box2  = new Box<>(); // no error
        box.setItem(45);
        box1.setItem(45.20);
        box2.setItem(45.20F);

        System.out.println(box.getItem());
        System.out.println(box1.getItem());
        System.out.println(box2.getItem());

    }
}
