package com.javaDigest.Oops.encapsulation.test;


import com.javaDigest.Oops.encapsulation.Student;

public class Test {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Kunal");
        student.setRollNumber(-15);
        student.setAge(15);
        System.out.println(student.getName());
        System.out.println(student.getAge());
        System.out.println(student.getRollNumber());


//        BankAccount ba = new BankAccount();
//          ba.setAccountNumber(3632564);
//            ba.deposit(-10);
//            ba.withdraw(10);
//            ba.deposit(100);
//            ba.withdraw(10);
//            System.out.println( ba.getBalance());




    }
}

