package com.javaDigest.generics.generic_start;

public class MainForBox {
    public static void main(String[] args) {
        // creating Box class instance.
        Box box = new Box();
        box.setValue(1);
        int i = (Integer) box.getValue(); // we had to cast here in Integer as we changed the Object type to int.
        System.out.println(i); // But I could have stored it in String as well and cast in the String thinking String might also be there.

//         Solution is we will have to make this Box class Generic type.
//         Syntax would be Box<T> t means type and this T will be defined at the tine of this class instantiation.
//         Instead of T we can give any single letter. But the convention is to give it as T with when we are passing single parameter.
//         Generic types allow you to define a class, interface or method with placeholders (type parameters) for the data
//        they will work with.
    }
}
