package com.javaDigest.constructors.test;


import com.javaDigest.constructors.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student("Kunal", 15, 41);
        Student student1 = new Student(10);
        Student student2 = new Student("Rohan");
//        student.setAge(50);
        System.out.println("The name of the first student is : "+ student.getName());
        System.out.println("The age of the first student is : "+ student.getAge());
        System.out.println("The rollNumber of the first student is :"+ student.getRollNumber());
        System.out.println("The name of the second student is : "+ student2.getName());
        System.out.println("The age of the second student is : "+ student1.getAge());


    }
}
