package com.javaDigest.accessModifier.school;

public class Student {
    public String name;
    public int age;
    //static int height;



    private Student() {

    }


    public void sayHi(){
        System.out.println("Hello!!");
    }

//    public static int getHeight() {
//        return height;
//    }
//
//    public static void setHeight(int height) {
//        Student.height = height;
//    }
//    public static String sayBye(){
//      return "Bye...";
//    }
}

