package com.javaDigest.generics.generic_start;

public class MainForBox1 {
    public static void main(String[] args) {
        Box1<Integer> box1 = new Box1<>(); // Box1 is now type safe. which Box class was not.
        box1.setValue(1);
//        String str = (String) box1.getValue(); // This is the benefit at the compile time we are getting the error. which earlier we were not getting.
        int i = box1.getValue();
        System.out.println(i);
    }
}
