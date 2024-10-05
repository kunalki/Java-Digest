package com.javaDigest.generics.generic_start;

// generics example with more than one parameter.
// This K and V will be defined while instantiating Pair class.
 public class Pair <K,V> {

     private K key;
     private V value;

     public Pair (K key, V value){
         this.key = key;
         this.value = value;
    }

    // Already set the value in constructor that is why let's create only getters.

    public K getKey(){
         return key;
    }
    public V getValue(){
         return value;
    }
}
