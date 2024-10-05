package com.javaDigest.generics.generic_start;

public class MainForPair {
    public static void main(String[] args) {
      Pair<String, Integer> pair = new Pair<>("age", 30);
        System.out.println(pair.getKey());
        System.out.println(pair.getValue());

/*
             T: Type when we pass the single argument.
             E: Element (used in collection)
             K: key (used in maps)
             V: value (used in maps)
             N: Number

   */
    }
}
