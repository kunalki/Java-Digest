package com.javaDigest.statciExample;

public class Example {
    static int i = 10;
    int a = 15;

    Example(){
        System.out.println("I am constructor.");
    }
    public static void main(String[] args) {
        System.out.println(i);
        // for a instance variable we will have to instantiate the class.
        Example ex = new Example();
        System.out.println(ex.a);
        System.out.println("i am here from static method "+ sumTwo(i, 5)); // because i is a static variable that is reason for the argument passed for static method we can use here.
    }
    static int sumTwo(int i, int k){
        int sum = i + k;
        return sum;
    }

    static {
        System.out.println("Hi All, I am under static block.");
/*
        Calling of static block in java?

                Now comes the point of how to call this static block.
                So in order to call any static block, there is no specified way as static block executes automatically
                when the class is loaded in memory. Refer to the below illustration for understanding how static block is called.
    */

    }
}
