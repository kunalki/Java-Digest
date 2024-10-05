package com.javaDigest.generics.generic_start;

import java.util.ArrayList;

public class MainForArrayList {
    public static void main(String[] args) {
        //  problem Without generics
        ArrayList list = new ArrayList();
        list.add( "Hello" );
        list.add( 2 );
        list.add( 4.52 );

        // retrieving the value
        String str = (String) list.get(0); // passing the index and storing the local variable in the type of object then
        System.out.println(str);           // No problem to change that in String and caste that in String thinking String would be Stored there and as we know all the classes in java extends Object clas and casting we did to because it would expect String after that
        String  integer = (String) list.get(1); // Again Stored this in local type of Object and cast in String thinking String would be thr again.
        System.out.println(integer); // ClassCastException. Why? Because Integer is expected and String is provided. Integer can not be changed into String.

        // So three major issues we are encountering without generics
//        1) Type Safety -> means we are storing any data type as per our choice.
//        2) Manual Casting
//        3) No compile time checking - problem occurs at Runtime.
        // let's look at some more problems in other classes of this package.

//        To overcome this problem in Java 5 Generics was introduced using which we can store any single data type of objects.
//        ArrayList<String> list = new ArrayList<>(); // Syntax
    }
}
