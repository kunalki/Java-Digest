package com.javaDigest.Oops.inheritenece.test;


import com.javaDigest.Oops.inheritenece.humans.Child;

public class Test {

    public static void main(String[] args) {

//        Dog dog = new Dog();
//        dog.setName("Bob");
//        dog.setAge(2);
//        dog.eat();
//        dog.sayHello();
//         Cat cat = new Cat();
//         cat.setName("Mausi");
//         cat.setAge(3);
//         cat.eat();
//         cat.sayHello();

        Child child = new Child("Ram", 10);
        System.out.println(child.getAge());
        child.childMethod();
//            child.setName("Babli");
//            child.setAge(16);
//           System.out.println(child.getAge());
//           System.out.println(child.hasSuperPowers());

//            Parent parent = new Parent();
//            parent.setName("Sanjeev");
//            parent.setAge(54);
    }
}

