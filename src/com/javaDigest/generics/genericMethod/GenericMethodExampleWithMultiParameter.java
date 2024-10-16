package com.javaDigest.generics.genericMethod;

public class GenericMethodExampleWithMultiParameter {
    public <T, U> void printTwoItems(T item1, U item2) {
        System.out.println(item1 + " and " + item2);
    }

    public static void main(String[] args) {
        GenericMethodExampleWithMultiParameter example = new GenericMethodExampleWithMultiParameter();

        example.printTwoItems(10, "Apples"); // Output: 10 and Apples
        example.printTwoItems("Hello", 3.14); // Output: Hello and 3.14
    }
}
