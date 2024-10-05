package com.javaDigest.generics.genericConstructor;

class Test {

    // Generic constructor
//    public <T> Test(T input) {
    public <T extends Number> Test(T input) {
        System.out.println(input.getClass().getName());
    }


    public static void main(String[] args) {
        // here we can pass any data type value. But i want only to be Number type in that case generics type will in constructor will have to extend Number class.
        Test test = new Test(12.34);  // Output: java.lang.Double
    }
}