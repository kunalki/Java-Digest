package com.javaDigest.accessModifier.test;

import com.javaDigest.accessModifier.zoo.Dog;

public class Test {
    public static void main(String[] args) {
//        System.out.println(Student.sayBye());
//           Student student = new Student();
//           student.name = "nounal";
//           student.age = 30;
//           student.sayHi();
//          Student.setHeight(5);
//        System.out.println(Student.getHeight());]

        // As instance ref variable has been declared static it can only be accessed through the class name
        // and get instance method being static in nature can only be accessed through class name. Here this getInstance method will be checked
        // Initially instance ref of School class will obviously be null. Being null first time class will be instantiated inside the method.
        // second time as condition will not be satisfied. it will return the same instance.
//        School.getInstance();

        Dog dog = new Dog("bob");
        dog.makeSound();
        // now here changeSound() method which has been declared in the Animal class has been declared as protected. So we can not access that
//        method in the Test class. we can access in the dog class as we have accessed as well because dog class is extending the Animal class.
        dog.setSound("woof");
        dog.makeSound();
        dog.wagtail();
    }
}

