package com.javaDigest.accessModifier.test;

public class School {

    // This is basically singleton pattern.
    private static School instance;

    private School(){

    }

    public static School getInstance(){
        if( instance == null){
            instance = new School();
        }
        return instance;
    }
}

