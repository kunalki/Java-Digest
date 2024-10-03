package com.javaDigest.methods;

public class ArrayPassByDots {
    public static void main(String[] args) {
        System.out.println(sum(1,5,9));
        // if we want to pass the array in a single line basically anonymous array
        // but this is redundant. because in the method below we have passed varargs.
        //System.out.println(sum(new int[]{4,8,7}));
    }

    // we passed here three ... dots means now we don't need to pass array now here. This is what we call varargs.
    public static int sum(int...a){
        int res = 0;
        for( int i: a){
            res += i;
        }
        return res;
    }
}
